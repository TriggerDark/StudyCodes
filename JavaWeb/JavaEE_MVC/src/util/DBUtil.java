package util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



/**
 * 数据库工具类，用来建立数据库连接和关闭连接
 * @author SuperStar
 *
 */

public class DBUtil {
	private static String driverClass;
	private static String url;
	private static String user;
	private static String password;
	
	/*
	 * 静态代码块
	 * 在类加载时(第一次使用类时)，会自动执行
	 * 静态代码快中的内容，在程序中运行期间，一个类只会
	 * 加载一次，所以静态代码块也只会运行一次，
	 * 常用于初始化静态成员的目的
	 */
	static {
		Properties p = new Properties();
		try {
			//加载DBUtil所在项目根文件夹下的db.properties
			//从配置文件中读取key为driverClass的值
			p.load(DBUtil.class.getResourceAsStream("/db.properties"));
			driverClass = p.getProperty("driverClass");
			url = p.getProperty("url");
			user = p.getProperty("user");
			password = p.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("读取数据库配置文件失败");
		}
	}
	
	public static Connection getConnection() {
		try {
			//1.加载驱动
			Class.forName(driverClass);
			//2.通过DriverManager类获取连接
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("加载驱动失败");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("建立连接失败，请检查连接的数据库名、用户名和密码");
		}
		
	}
	
	//关闭指定数据库
	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("关闭数据库失败");
			}
		}
	}
	
//	public static void main(String[] args) {
//		Connection conn = getConnection();
//		System.out.println(conn);
//		close(conn);
//		System.out.println("关闭服务器成功");
//	}

}
