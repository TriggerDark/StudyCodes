package cn.tedu.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.tedu.dao.IDeptDao;
import cn.tedu.entity.Dept;

public class TestIUserDao {
	//1) 加载配置文件SqlMapConfig，生成SqlSessionFactory对象
	private SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
			.build(TestIUserDao.class.getResourceAsStream("/SqlMapConfig.xml"));
	
	@Test
	public void testInsertDept() {
		//2) 利用SqlSessionFatory对象，生成SqlSession对象
		SqlSession session = ssf.openSession();
		//3) 利用SqlSession的getMapper方法生成并获取指定接口实现类的对象
	 	IDeptDao dao = session.getMapper(IDeptDao.class);
	 	//4) 调用生成的指定接口实现类的对象的各种方法，完成对数据库表的各种操作
	 	Dept dept = new Dept();
	 	dept.setDeptName("测试一部");
	 	dept.setAddress("张家港");
	 	dao.insertDept(dept);
	 	session.commit();//提交事务
	 	//5) 关闭SqlSession会话
	 	session.close();
	}
	
	@Test
	public void testDeleteDept() {
		SqlSession session = ssf.openSession();
		IDeptDao dao = session.getMapper(IDeptDao.class);
		dao.deleteByID(1);
		session.commit();
		session.close();
	}
	
	@Test
	public void testUpdateDept() {
		SqlSession session = ssf.openSession();
		IDeptDao dao = session.getMapper(IDeptDao.class);
		Dept dept = new Dept();
		dept.setDeptName("开发二部");
		dept.setAddress("无锡");
		dept.setId(2);
		dao.updateDept(dept);
		session.commit();
		session.close();
	}
	
	@Test
	public void testSelectById() {
		SqlSession session = ssf.openSession();
		IDeptDao dao = session.getMapper(IDeptDao.class);
		Dept dept = dao.selectById(9);
		System.out.println(dept);
		session.close();
	}
	
	@Test
	public void testSelectAll() {
		SqlSession session = ssf.openSession();
		IDeptDao dao = session.getMapper(IDeptDao.class);
		List<Dept> list = dao.selectAll();
		for (Dept dept:list) {
			System.out.println(dept);
		}
		session.close();
	}
	
}





