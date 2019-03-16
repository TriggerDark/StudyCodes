package cn.tedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.entity.Dept;

/**
 * 对Dept表进行各种访问的接口
 * 在MyBatis的动态代理实现方式中，会自动生成该接口的
 * 实现类(实现接口中的所有方法)
 * @author SuperStar
 *
 */

public interface IDeptDao {
	
	/* MyBatis中表达式#{name}
	 * 若方法的参数是直接赋值的类型(如基本类型或String)
	 * 则表示直接取name的值；若方法的参数是一个对象，则取该对象name属性的值
	 */
	
	@Insert("insert into dept(deptName, address) "
			+ "values(#{deptName}, #{address})")
	public void insertDept(Dept dept);//插入部门
	
	@Delete("delete from dept where id=#{id}")
	public void deleteByID(Integer id);//按id删除部门
	
	@Update("update dept set deptName=#{deptName}, address=#{address} where id=#{id}")
	public void updateDept(Dept dept);
	
	/*
	 * 若找到，则返回一个Dept对象
	 * 若未找到，则返回null
	 */
	@Select("select id, deptName, address from dept where id=#{id}")
	public Dept selectById(Integer id);//按id查询部门
	
	/*
	 * 返回一个List列表，若表中没有任何数据
	 * 返回一个空的List列表
	 * 即List列表的size()为空
	 */
	@Select("select id, deptName, address from dept")
	public List<Dept> selectAll();//查询所有记录
	
}
