package example.service;

import example.MyBatisUtil;
import example.datasource.city.JltourCityMapper;
import example.datasource.hotel.HotelMapper;
import example.model.city.JltourCity;
import example.model.hotel.Hotel;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Created by feng on 15/12/29.
 */
public class JltourCityService {
    static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
    }
    /**
     * 根据cityid 查找某城市
     */
    public static JltourCity findCity(String cityid){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        JltourCity jltourCity = new JltourCity();
        try {
            JltourCityMapper jltourCityMapper = sqlSession.getMapper(JltourCityMapper.class);


            jltourCity = jltourCityMapper.getJlcity(cityid) ;
            return jltourCity ;

        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            sqlSession.close();
        }
        return jltourCity ;
    }



}
