package util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



/**
 * ���ݿ⹤���࣬�����������ݿ����Ӻ͹ر�����
 * @author SuperStar
 *
 */

public class DBUtil {
	private static String driverClass;
	private static String url;
	private static String user;
	private static String password;
	
	/*
	 * ��̬�����
	 * �������ʱ(��һ��ʹ����ʱ)�����Զ�ִ��
	 * ��̬������е����ݣ��ڳ����������ڼ䣬һ����ֻ��
	 * ����һ�Σ����Ծ�̬�����Ҳֻ������һ�Σ�
	 * �����ڳ�ʼ����̬��Ա��Ŀ��
	 */
	static {
		Properties p = new Properties();
		try {
			//����DBUtil������Ŀ���ļ����µ�db.properties
			//�������ļ��ж�ȡkeyΪdriverClass��ֵ
			p.load(DBUtil.class.getResourceAsStream("/db.properties"));
			driverClass = p.getProperty("driverClass");
			url = p.getProperty("url");
			user = p.getProperty("user");
			password = p.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("��ȡ���ݿ������ļ�ʧ��");
		}
	}
	
	public static Connection getConnection() {
		try {
			//1.��������
			Class.forName(driverClass);
			//2.ͨ��DriverManager���ȡ����
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("��������ʧ��");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("��������ʧ�ܣ��������ӵ����ݿ������û���������");
		}
		
	}
	
	//�ر�ָ�����ݿ�
	public static void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("�ر����ݿ�ʧ��");
			}
		}
	}
	
//	public static void main(String[] args) {
//		Connection conn = getConnection();
//		System.out.println(conn);
//		close(conn);
//		System.out.println("�رշ������ɹ�");
//	}

}
