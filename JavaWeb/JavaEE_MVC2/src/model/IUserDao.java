package model;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import entity.User;

public interface IUserDao {
	
	@Select("select username, password, phone, address from user "
			+ "where username=#{username}")
	public User findByUsername(String userName);
	
	@Insert("insert into user(username, password, phone, address) "
			+ "values(#{username}, #{password}, #{phone}, #{address})")
	public void insert(User user);
	
}
