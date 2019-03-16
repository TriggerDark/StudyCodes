package model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.User;

/**
 * 为了方便UserService使用，本实现类对MyBatis框架
 * 自动生成的IUserDao接口的实现类进行了封装
 * 
 * MyBatis框架与Spring框架整合后，本类的所有功能
 * 由框架自动生成，不再需要编写此类
 * @author SuperStar
 *
 */
public class UserDao implements IUserDao {

	private SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(UserDao.class.getResourceAsStream("/SqlMapConfig.xml"));
	
	@Override
	public User findByUsername(String userName) {
		SqlSession session = ssf.openSession();
		IUserDao dao = session.getMapper(IUserDao.class);
		User user = dao.findByUsername(userName);
		session.close();
		return user;
	}

	@Override
	public void insert(User user) {
		SqlSession session = ssf.openSession();
		IUserDao dao = session.getMapper(IUserDao.class);
		dao.insert(user);
		session.commit();
		session.close();
	}

}
