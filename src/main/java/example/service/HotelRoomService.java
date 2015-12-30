package example.service;

import example.MyBatisUtil;
import example.datasource.hotel.HotelMapper;
import example.datasource.hotel.HotelRoomMapper;
import example.model.hotel.Hotel;
import example.model.hotel.HotelRoom;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by feng on 15/12/29.
 */
public class HotelRoomService {
    static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }
    /**
     * 保存酒店房型
     * @param hotelRoom
     */
    public static void addHotelRoom(HotelRoom hotelRoom){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            HotelRoomMapper hotelRoomMapper = sqlSession.getMapper(HotelRoomMapper.class);


            hotelRoomMapper.insertHotelRoom(hotelRoom);
            System.out.println(hotelRoom.getName());
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();
        }
    }
    /**
     * 更新酒店房型
     * @param hotelRoom
     */
    public static void updateHotelRoom(HotelRoom hotelRoom){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            HotelRoomMapper hotelRoomMapper = sqlSession.getMapper(HotelRoomMapper.class);

            hotelRoomMapper.update(hotelRoom);
            System.out.println(hotelRoom.getName());
            sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
        } finally {
            sqlSession.close();
        }
    }
    /**
     * 根据room_id 查找某一酒店
     */
    public static HotelRoom findHotelRoom(String room_id){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        HotelRoom hotelRoom = new HotelRoom();
        try {
            HotelRoomMapper hotelRoomMapper = sqlSession.getMapper(HotelRoomMapper.class);


            hotelRoom = hotelRoomMapper.getHotelRoom(room_id);
            return hotelRoom ;

        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            sqlSession.close();
        }
        return hotelRoom ;
    }
    /**
     * 根据room_id 查找某一酒店房型
     */
    public static HotelRoom findHotelRoomByJltourRid(String jltour_roomtypeid){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        HotelRoom hotelRoom = new HotelRoom();
        try {
            HotelRoomMapper hotelRoomMapper = sqlSession.getMapper(HotelRoomMapper.class);


            hotelRoom = hotelRoomMapper.getHotelRoomByJltourRid(jltour_roomtypeid);
            return hotelRoom ;

        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            sqlSession.close();
        }
        return hotelRoom ;
    }
}
