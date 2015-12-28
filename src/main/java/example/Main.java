package example;

import com.google.gson.Gson;
import example.datasource.hotel.HotelIdMapper;
import example.model.hotel.*;
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

    public static void main2(String[] args) {
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
            message="{'Usercd':'szjl','Authno':'123456','roomtypeids':'1/2/3'}";

            //3.5下单前检验最新价格、房态接口
            //message = "{'Usercd':'sz2747','Authno':'123456','QueryType':'checkprice','roomTypeId':1, 'checkInDate':'2016-3-19','checkOutDate':'2016-3-20','roomNum':1,'pricingType':12,'rateType':1}" ;

            //3.14
            //curlHotelId() ;
            //3.1 抓取酒店
            //curlHotel() ;
            System.out.println(findHotelId().size()) ;
            //System.out.print(res);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * 抓取所有酒店
     */
    public static void curlAllHotel(){
        List list = findHotelId() ;
        List<String> list1 = hotelIdGroup(list) ;
        for (int i=0;i<list1.size();i++){
            curlHotel(list1.get(i));
        }
    }
    /**
     * 20一组hotelid
     * @param hotelIds
     * @return
     */
    public static List hotelIdGroup(List<HotelId> hotelIds){
        List<String> list = new ArrayList<String>() ;
        String str = "" ;

        int start = 0 ;
        int size = hotelIds.size() ;
        for (int i=start;i<size;i++){
            //满20一组
            if(i!=start&&i%20==0){
                //System.out.println(i) ;
                str = str.substring(0,str.length()-1) ;
                //System.out.println(str) ;

                list.add(str);
                str = i+"/" ;
            }else{
                str = str+i+"/" ;
            }
            //最后一个
            if(i==size){
                str = str.substring(0,str.length()-1) ;
                list.add(str);
            }
        }
        return list ;
    }
    /**
     * 查找所有酒店id
     */
    public static List<HotelId> findHotelId(){
        List<HotelId> hotelIds = null ;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            HotelIdMapper hotelIdMapper = sqlSession.getMapper(HotelIdMapper.class);
            HotelId hotelId = new HotelId();

            hotelIds = hotelIdMapper.findHotelIds() ;
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
            return hotelIds ;

        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            sqlSession.close();
        }
        return hotelIds ;
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
            HotelResult hotelId = gson.fromJson(res,HotelResult.class) ;
            System.out.println(hotelId.getMsg());
            List<HotelResult.Data> list= hotelId.getData() ;
            //保存酒店
            Hotel hotel = new Hotel() ;
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
                //testAdd(hotelId1);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
    /**
     * 写入酒店ID
     * @param hotel
     */
    public static void testAdd(HotelId hotel) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            HotelIdMapper hotelIdMapper = sqlSession.getMapper(HotelIdMapper.class);
            HotelId hotelId = new HotelId();

            hotelId.setHotelid(hotel.getHotelid());
            hotelId.setCountry(hotel.getCountry());
            hotelId.setCity(hotel.getCity());
            hotelId.setState(hotel.getState());
            hotelId.setHotelname(hotel.getHotelname());

            hotelIdMapper.insertHotelId(hotelId);
            System.out.println(hotelId.getHotelname());
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();
        }
    }
    public static void addHotel(Hotel hotel){

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
