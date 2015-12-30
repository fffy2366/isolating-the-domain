package example.service;

import example.MyBatisUtil;
import example.datasource.hotel.HotelMapper;
import example.model.hotel.Hotel;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by feng on 15/12/29.
 */
public class HotelService {
    static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }
    /**
     * 保存酒店
     * @param hotel
     */
    public static void addHotel(Hotel hotel){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            HotelMapper hotelMapper = sqlSession.getMapper(HotelMapper.class);


            hotelMapper.insertHotel(hotel);
            System.out.println(hotel.getName());
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();
        }
    }
    /**
     * 更新酒店
     * @param hotel
     */
    public static void updateHotel(Hotel hotel){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            HotelMapper hotelMapper = sqlSession.getMapper(HotelMapper.class);

            hotelMapper.update(hotel);
            System.out.println(hotel.getName());
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();
        }
    }
    /**
     * 根据hotel_id 查找某一酒店
     */
    public static Hotel findHotel(String hotel_id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Hotel hotel = new Hotel();
        try {
            HotelMapper hotelMapper = sqlSession.getMapper(HotelMapper.class);


            hotel = hotelMapper.getHotel(hotel_id) ;
            return hotel ;

        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            sqlSession.close();
        }
        return hotel ;
    }
    /**
     * 根据hotel_id 查找某一酒店
     */
    public static Hotel findHotelByJltourHid(String jltour_hotel_id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Hotel hotel = new Hotel();
        try {
            HotelMapper hotelMapper = sqlSession.getMapper(HotelMapper.class);


            hotel = hotelMapper.getHotelByJltourHid(jltour_hotel_id) ;
            return hotel ;

        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            sqlSession.close();
        }
        return hotel ;
    }
}
