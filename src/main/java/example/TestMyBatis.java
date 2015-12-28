/**
 * http://www.cnblogs.com/magialmoon/archive/2013/10/30/3397828.html
 */
package example;

import mpers.UserMapper;
import example.model.user.Name;
import example.model.user.User;
import example.model.user.UserId;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class TestMyBatis {
	static SqlSessionFactory sqlSessionFactory = null;
	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public static void main(String[] args) {
		testAdd();
		getUser();
	}

	public static void testAdd() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = new User();
			user.setId(new UserId("a@b.c"));
			Name name = new Name() ;
			name.setValue("test");
			user.setName(name);
			userMapper.register(user);
			sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
		} finally {
			sqlSession.close();
		}
	}

	public static void getUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = userMapper.findBy(new UserId("a@b.c"));
			System.out.println("name: " + user.getName() + "|name: "
					+ user.getName());
		} finally {
			sqlSession.close();
		}
	}
}
