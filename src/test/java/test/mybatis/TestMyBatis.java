/**
 * http://www.cnblogs.com/magialmoon/archive/2013/10/30/3397828.html
 */
package test.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class TestMyBatis {
	static SqlSessionFactory sqlSessionFactory = null;
	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public static void main2(String[] args) {
		testAdd();
		getUser();
	}

	public static void testAdd() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = new User("lisi", new Integer(25));
			userMapper.insertUser(user);
			sqlSession.commit();// 这里一定要提交，不然数据进不去数据库中
		} finally {
			sqlSession.close();
		}
	}

	public static void getUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = userMapper.getUser("zhangsan");
			System.out.println("name: " + user.getName() + "|age: "
					+ user.getAge());
		} finally {
			sqlSession.close();
		}
	}
}
