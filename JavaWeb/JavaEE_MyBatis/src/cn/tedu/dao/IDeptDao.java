package cn.tedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.entity.Dept;

/**
 * ��Dept�����и��ַ��ʵĽӿ�
 * ��MyBatis�Ķ�̬����ʵ�ַ�ʽ�У����Զ����ɸýӿڵ�
 * ʵ����(ʵ�ֽӿ��е����з���)
 * @author SuperStar
 *
 */

public interface IDeptDao {
	
	/* MyBatis�б���ʽ#{name}
	 * �������Ĳ�����ֱ�Ӹ�ֵ������(��������ͻ�String)
	 * ���ʾֱ��ȡname��ֵ���������Ĳ�����һ��������ȡ�ö���name���Ե�ֵ
	 */
	
	@Insert("insert into dept(deptName, address) "
			+ "values(#{deptName}, #{address})")
	public void insertDept(Dept dept);//���벿��
	
	@Delete("delete from dept where id=#{id}")
	public void deleteByID(Integer id);//��idɾ������
	
	@Update("update dept set deptName=#{deptName}, address=#{address} where id=#{id}")
	public void updateDept(Dept dept);
	
	/*
	 * ���ҵ����򷵻�һ��Dept����
	 * ��δ�ҵ����򷵻�null
	 */
	@Select("select id, deptName, address from dept where id=#{id}")
	public Dept selectById(Integer id);//��id��ѯ����
	
	/*
	 * ����һ��List�б���������û���κ�����
	 * ����һ���յ�List�б�
	 * ��List�б���size()Ϊ��
	 */
	@Select("select id, deptName, address from dept")
	public List<Dept> selectAll();//��ѯ���м�¼
	
}