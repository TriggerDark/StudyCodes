package com.demo.daoImp;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.dao.UserDao;
import com.demo.user.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class UserDaoImp implements UserDao {
	
	@Override
	public User getUserInfo(String province) {
		User u = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/data?user=root&&password=5841314921lrw");
			Statement stat = (Statement) con.createStatement();
			String sql = "select * from " + province;
			ResultSet rs = stat.executeQuery(sql);
			while(rs.next()) {
				u = new User();
				u.setCity(rs.getString("City"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

}
