package com.demo.serviceImp;

import com.demo.dao.UserDao;
import com.demo.daoImp.UserDaoImp;
import com.demo.service.UserService;
import com.demo.user.User;

public class UserServiceImp implements UserService {
	UserDao ud = new UserDaoImp();
	
	@Override
	public User getUserInfoService(String province) {
		// TODO Auto-generated method stub
		return ud.getUserInfo(province);
	}

}
