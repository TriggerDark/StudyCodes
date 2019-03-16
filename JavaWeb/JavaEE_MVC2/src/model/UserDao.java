package model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.User;

/**
 * Ϊ�˷���UserServiceʹ�ã���ʵ�����MyBatis���
 * �Զ����ɵ�IUserDao�ӿڵ�ʵ��������˷�װ
 * 
 * MyBatis�����Spring������Ϻ󣬱�������й���
 * �ɿ���Զ����ɣ�������Ҫ��д����
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