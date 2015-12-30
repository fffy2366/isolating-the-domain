package example;

import com.google.gson.Gson;
import example.datasource.hotel.HotelIdMapper;
import example.datasource.hotel.HotelMapper;
import example.model.hotel.*;
import example.service.HotelIdService;
import example.service.HotelRoomService;
import example.service.HotelService;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }

    public static void main(String[] args) {
        // write your code here
        //doPost(message,"http://58.250.56.214:6000/commonQueryServlet") ;
        String message ;
        String res ;
        Main m = new Main();
        try {
            //3.1
            message = "{'Usercd':'sz2747','Authno':'123456' ,'hotelIds':’1/2/3’,’QueryType’:’hotelinfo’}";
            message = "{'Usercd':'sz2747','Authno':'123456' ,'hotelIds':'45748','QueryType':'hotelinfo'}" ;
            //res = m.doPost(message, "http://58.250.56.214:6000/commonQueryServlet");
            //3.2
            message = "{\"Usercd\":\"sz2747\",\"Authno\":\"123456\",\" QueryType \":\" checkratetype \" }";
            //res = m.doPost(message,"http://58.250.56.214:6000/commonQueryServlet") ;

            //3.3 获取捷旅酒店价格/房态/预订条款/修改条款
            message = "{\"Usercd\":\"sz2747\",\"Authno\":\"123456\",\"checkInDate\":\"2016-01-08\",\"checkOutDate\":\"2016-01-10\",\"roomNum\":1,\"hotelIds\":\"1/2/3\",\"QueryType\":\"hotelpriceall\"}";
            message = "{\"Usercd\":\"sz2747\",\"Authno\":\"123456\",\"checkInDate\":\"2016-01-08\",\"checkOutDate\":\"2016-01-10\",\"roomNum\":1,\"hotelIds\":\"1/2/3\",\"QueryType\":\"hotelpricecomfirm\"}";
            //res = m.doPost(message, "http://58.250.56.214:6000/commonQueryServlet");

            //3.4 变价通知(getHotelPricelist)?
            //message="{'Usercd':'szjl','Authno':'123456','roomtypeids':'1/2/3'}";

            //3.5下单前检验最新价格、房态接口
            //message = "{'Usercd':'sz2747','Authno':'123456','QueryType':'checkprice','roomTypeId':1, 'checkInDate':'2016-3-19','checkOutDate':'2016-3-20','roomNum':1,'pricingType':12,'rateType':1}" ;

            //3.14
            //curlHotelId() ;
            //3.1 抓取酒店
            //curlHotel() ;
            //System.out.println(findHotelId().size()) ;
            //curlAllHotel() ;//抓取所有酒店
            //curlHotel("2149/2606/2954/3194") ;
            //System.out.println(findHotel("1"));
            //HotelRoom hotelRoom = HotelRoomService.findHotelRoom("1") ;
            //System.out.println(hotelRoom.getName());

            //3.3抓取价格
            //System.out.print(res);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * 抓取所有酒店
     */
    public static void curlAllHotel(){
        List<HotelId> list = HotelIdService.findHotelId() ;
        System.out.println(list.get(0).getHotelid());
        List<String> list1 = HotelIdService.hotelIdGroup(list) ;
        System.out.println(list1.size()) ;

        for (int i=0;i<list1.size();i++){
            System.out.println(list1.get(i)) ;
            curlHotel(list1.get(i));
        }
    }



    /**
     * 抓取一组酒店
     */
    public static void curlHotel(String hotelIds){
        String message ;
        String res ;
        Main m = new Main();
        Gson gson = new Gson();
        HotelRequest hotelRequest = new HotelRequest() ;
        hotelRequest.setUsercd("sz2747");
        hotelRequest.setAuthno("123456");
        hotelRequest.setHotelIds(hotelIds);
        hotelRequest.setQueryType("hotelinfo");
        message =  gson.toJson(hotelRequest);
        try {
            res = m.doPost(message, "http://58.250.56.214:6000/commonQueryServlet");
//            System.out.println(res);
//            if(true){
//                return;
//            }
            HotelResult hotelId = gson.fromJson(res,HotelResult.class) ;
            System.out.println(hotelId.getMsg());
            List<HotelResult.Data> list= hotelId.getData() ;
            for (int i=0;i<list.size();i++){

                HotelResult.Data data = list.get(i) ;
                //查找酒店
                Hotel h = HotelService.findHotelByJltourHid(data.getHotelid() + "") ;
                if(h==null){
                    h = new Hotel() ;
                }
                h.setJltour_hotel_id(data.getHotelid());
                h.setName(data.getNamechn());
                h.setNumbering(data.getHotelcd());
                h.setAddress(data.getAddresschn());
                h.setTel(data.getCentraltel());
                h.setCheck_in_rules("");
                h.setFeature("");
                h.setService("");
                h.setStars(data.getStar() * 2);
                h.setCity_id(1);
                h.setLongitude(data.getJingdu());
                h.setLatitude(data.getWeidu());
                if(h.getHotel_id()==0){
                    //保存酒店
                    HotelService.addHotel(h);
                }else{
                    //更新
                    HotelService.updateHotel(h);
                }

                //更新房型
                List<HotelResult.Data.Rooms> roomsList  = data.getRooms() ;
                for (int j=0;j<roomsList.size();j++){
                    HotelResult.Data.Rooms rooms = roomsList.get(j) ;
                    //查找房型
                    //System.out.println(hotelRoom.getJltour_roomtypeid());
                    //HotelRoomService.findHotelRoom()
                    HotelRoom hotelRoom = HotelRoomService.findHotelRoomByJltourRid(rooms.getRoomtypeid()+"") ;
                    if(hotelRoom==null){
                        hotelRoom = new HotelRoom() ;
                    }
                    hotelRoom.setJltour_roomtypeid(rooms.getRoomtypeid()+"");
                    hotelRoom.setHotel_id(h.getHotel_id() + "");
                    hotelRoom.setName(rooms.getNamechn());
                    hotelRoom.setType("1");
                    hotelRoom.setDescription(rooms.getRemark2());
                    hotelRoom.setBreakfast("");
                    hotelRoom.setBroadband("");
                    hotelRoom.setWifi("");
                    hotelRoom.setBed_type((new BedType()).getType(rooms.getBedtype()));

                    hotelRoom.setPrice(0+ "");
                    hotelRoom.setWeekend_price(0+"");

                    hotelRoom.setFloor(rooms.getFloordistribution());
                    hotelRoom.setBuilding_area(rooms.getAcreages());
                    hotelRoom.setNon_smoking_rooms(rooms.getNosm()==1?"是":"否");

                    hotelRoom.setBed_type(rooms.getBedtype());
                    hotelRoom.setBed_type_desc(rooms.getBedtype());

                    hotelRoom.setGalleryful("");//缺少容纳人数
                    hotelRoom.setCancel(2);//1 可取消 2 不可取消
                    hotelRoom.setExclusive_count("0");
                    hotelRoom.setCount("0");
                    hotelRoom.setBed_width("");
                    hotelRoom.setJltour_active(rooms.getActive());
                    if(hotelRoom.getRoom_id()==null){
                        HotelRoomService.addHotelRoom(hotelRoom);
                    }else {
                        HotelRoomService.updateHotelRoom(hotelRoom);
                    }

                }
            }

            //保存房型


            System.out.println(list.size()) ;

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    /**
     * 抓取酒店ID
     */
    public static void curlHotelId(){
        String message ;
        String res ;
        Main m = new Main();
        message = "{\"Usercd\":\"SZ2747\",\"Authno\":\"123456\",\"QueryType\":\"gainhotelids\",\"state\":\"70555\"}" ;
        try {
            res = m.doPost(message, "http://58.250.56.214:6000/commonQueryServlet");
            Gson gson = new Gson();
            HotelIdResult hotelId = gson.fromJson(res,HotelIdResult.class) ;
            System.out.println(hotelId.getMsg());
            List<HotelIdResult.Data> list= hotelId.getData() ;
            System.out.println(list.size()) ;

            for (int i=0;i<list.size();i++){
                System.out.println(i) ;
                HotelId hotelId1 = new HotelId() ;
                hotelId1.setHotelid(list.get(i).getHotelid());
                hotelId1.setCity(list.get(i).getCity());
                hotelId1.setCountry(list.get(i).getCountry());
                hotelId1.setHotelname(list.get(i).getHotelname());
                hotelId1.setState(list.get(i).getState());
                //HotelIdService.add(hotelId1);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }



    /**
     * 3.1 该接口由深圳捷旅提供，供客户调用 ，用于客户获取捷旅指定酒店列表的酒店基本信息、房型基本信息。
     *
     * @param message
     * @param strURL
     * @return
     * @throws Exception
     */
    public static String doPost(String message, String strURL) throws Exception {
        URL url = new URL(strURL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();// 建立针对该URL的连接
        con.setRequestMethod("POST");
        con.setUseCaches(false);// 不使用缓存
        con.setDoInput(true);// 允许输入
        con.setDoOutput(true);// 允许输出
        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);
        con.setRequestProperty("Content-Type", "text/html;charset=UTF-8");
        con.connect();

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(con.getOutputStream(), "UTF-8"));

        out.write(message);
        out.flush();
        out.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

        String strResult = in.readLine();
        in.close();

        return strResult;
    }

}
