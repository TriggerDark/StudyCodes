package com.demo.Servlet;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class readData {
	protected static ArrayList<String> data(String cstr, String str) {
		String s = "";
		ArrayList<String> astr= new ArrayList<>(); 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/data?user=root&&password=5841314921lrw");
			Statement stat = (Statement) con.createStatement();
			String sql = "select * from " + cstr;
			ResultSet rs = stat.executeQuery(sql);
			while(rs.next()){
				astr.add(rs.getString(str));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return astr;
	}
	
	public static void main(String[] args) {
		String cstr1 = "province";
		String cstr2 = "sdcity";
		String cstr3 = "jscity";
		String cstr4 = "zjcity";
		String str1 = "Province";
		String str2 = "City";
//		System.out.println(data(cstr1, str1));
//		System.out.println(data(cstr2, str2));
//		System.out.println(data(cstr3, str2));
//		System.out.println(data(cstr4, str2));
		ArrayList<String> s = readData.data(cstr1, str1);
	}
}
