package model;

import entity.User;

/**
 * 处理用户登录、注册的业务模型
 * @author SuperStar
 *
 */
public class UserService {
	/*
	 * 成员变量userDao
	 * userService需要依赖UserDao类对象来完成业务处理
	 */
	private UserDao userDao = new UserDao();
	
	/**
	 * 完成注册业务逻辑
	 * @param newuser 要注册的新用户
	 * @return 返回注册的结果(注册成功或注册失败)
	 */
	public String regist(User newuser) {
		String message = null;
		/*
		 * 思路如下：
		 * 首先要检查要注册的用户名是否存在。若存在
		 * 则注册失败，若不存在，则进行注册
		 */
		User user = userDao.findByUsername(newuser.getUsername());
		if (user!=null) {
			message = "错误: " + newuser.getUsername()
						+ "已注册！<a href='regist.jsp'>重新注册</a>";

		} else {
			userDao.insert(newuser);//进行注册
		}
		return message;
	}
	
	/**
	 * 处理登录业务逻辑
	 * @param username 用户名
	 * @param password 用户密码
	 * @return 返回true/false
	 */
	public String login(String username, String password) {
		String message = null;
		User user = userDao.findByUsername(username);
		if (user!=null) {
			if (password.equals(user.getPassword())) {
				message = null;
			} else {
				message = "错误: " + username + "用户密码不正确，请重新登录！"
						+ "<a href='login.jsp'>注册</a>";
			}
		} else {
			message = "错误: " + username + "不存在！"
					+ "<a href='regist.jsp'>注册</a>";
		}
		return message;
	}
	
	
}
