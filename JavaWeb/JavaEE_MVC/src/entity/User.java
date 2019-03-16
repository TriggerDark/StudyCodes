package entity;

import java.io.Serializable;

/**
 * ʵ���࣬�����ݿ���User�����Ӧ
 * @author SuperStar
 * ʵ���࣬��νʵ���࣬���������ݿ�������Ӧ����
 * ������û�и���ҵ����߼���ͨ���߱�����������
 * 1) �ṩ�޲ι��췽��
 * 2) ӵ��˽�����ԣ���˽�����������������һһ��Ӧ
 * 3) �ṩ˽�����Ե�get��set����һ�ṩ������
 * 3) ʵ�����л��ӿ�Serializable���Ա��������ϴ���
 */

public class User implements Serializable {
	private static final long serialVersionUID = 5386276983462770394L;
	private String username;
	private String password;
	private String phone;
	private String address;
	
	public User() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	
}