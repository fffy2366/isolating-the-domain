package example.service;

import example.MyBatisUtil;
import example.datasource.hotel.HotelPriceMapper;
import example.model.hotel.HotelPrice;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by feng on 15/12/31.
 */
public class HotelPriceService {
    static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }
    /**
     * 保存酒店价格
     * @param hotelPrice
     */
    public static void addHotelPrice(HotelPrice hotelPrice){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            HotelPriceMapper hotelPriceMapper = sqlSession.getMapper(HotelPriceMapper.class);


            hotelPriceMapper.insertHotelPrice(hotelPrice);
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();
        }
    }
    /**
     * 更新酒店价格
     * @param hotelPrice
     */
    public static void updateHotel(HotelPrice hotelPrice){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            HotelPriceMapper hotelPriceMapper = sqlSession.getMapper(HotelPriceMapper.class);

            hotelPriceMapper.update(hotelPrice);
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();
        }
    }
    /**
     * 根据jltour_roomtypeid /ratetype/per_day 查找某一房型某价格类型某天价格
     */
    public static HotelPrice findHotelPrice(HotelPrice hotelPrice){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        HotelPrice hotelPrice1 = new HotelPrice();
        try {
            HotelPriceMapper hotelPriceMapper = sqlSession.getMapper(HotelPriceMapper.class);

            hotelPrice1 = hotelPriceMapper.getHotelPrice(hotelPrice) ;
            return hotelPrice1 ;

        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            sqlSession.close();
        }
        return hotelPrice1 ;
    }



}
