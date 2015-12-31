package example.service;

import example.MyBatisUtil;
import example.datasource.hotel.HotelIdMapper;
import example.datasource.hotel.HotelMapper;
import example.model.hotel.Hotel;
import example.model.hotel.HotelId;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by feng on 15/12/29.
 */
public class HotelIdService {
    static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }
    /**
     * 写入酒店ID
     * @param hotel
     */
    public static void add(HotelId hotel) {
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
    /**
     * 更新酒店ID
     * @param hotel
     */
    public static void update(HotelId hotel){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            HotelIdMapper hotelIdMapper = sqlSession.getMapper(HotelIdMapper.class);

            hotelIdMapper.update(hotel);
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();
        }
    }

    /**
     * 根据id查找某一酒店
     */
    public static HotelId getHotelId(String hotelId){
        HotelId hotel = new HotelId();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            HotelIdMapper hotelIdMapper = sqlSession.getMapper(HotelIdMapper.class);

            hotel = hotelIdMapper.getHotelId(hotelId) ;
            return hotel ;

        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            sqlSession.close();
        }
        return hotel ;
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
            //sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
            return hotelIds ;

        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            sqlSession.close();
        }
        return hotelIds ;
    }
    /**
     * 20一组hotelid
     * @param hotelIds
     * @return
     */
    public static List<String> hotelIdGroup(List<HotelId> hotelIds){
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
                str = hotelIds.get(i).getHotelid()+"/" ;
            }else{
                str = str+hotelIds.get(i).getHotelid()+"/" ;
            }
            //最后一个
            if(i==size-1){
                str = str.substring(0,str.length()-1) ;
                list.add(str);
            }
        }
        return list ;
    }
}
