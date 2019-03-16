package model;

import entity.User;

/**
 * �����û���¼��ע���ҵ��ģ��
 * @author SuperStar
 *
 */
public class UserService {
	/*
	 * ��Ա����userDao
	 * userService��Ҫ����UserDao����������ҵ����
	 */
	private UserDao userDao = new UserDao();
	
	/**
	 * ���ע��ҵ���߼�
	 * @param newuser Ҫע������û�
	 * @return ����ע��Ľ��(ע��ɹ���ע��ʧ��)
	 */
	public String regist(User newuser) {
		String message = null;
		/*
		 * ˼·���£�
		 * ����Ҫ���Ҫע����û����Ƿ���ڡ�������
		 * ��ע��ʧ�ܣ��������ڣ������ע��
		 */
		User user = userDao.findByUsername(newuser.getUsername());
		if (user!=null) {
			message = "����: " + newuser.getUsername()
						+ "��ע�ᣡ<a href='regist.jsp'>����ע��</a>";

		} else {
			userDao.insert(newuser);//����ע��
		}
		return message;
	}
	
	/**
	 * ������¼ҵ���߼�
	 * @param username �û���
	 * @param password �û�����
	 * @return ����true/false
	 */
	public String login(String username, String password) {
		String message = null;
		User user = userDao.findByUsername(username);
		if (user!=null) {
			if (password.equals(user.getPassword())) {
				message = null;
			} else {
				message = "����: " + username + "�û����벻��ȷ�������µ�¼����ע�ᣡ"
						+ "<a href='login.jsp'>��½</a>"
						+ "<a href='regist.jsp'>ע��</a>";
			}
		} else {
			message = "����: " + username + "�����ڣ�"
					+ "<a href='regist.jsp'>ע��</a>";
		}
		return message;
	}
	
	
}