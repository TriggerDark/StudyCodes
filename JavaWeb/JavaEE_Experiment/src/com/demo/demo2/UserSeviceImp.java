package com.demo.demo2;

import java.util.List;

public class UserSeviceImp implements UserSrevice{
	//获取Dao层对象
	UserDao ud=new UserDaoImp();
	@Override
	public User getUserInfoService(String name) {
		// TODO Auto-generated method stub
		return ud.getUserInfo(name);
	}
	@Override
	public List<Area> getAreaInfoService(String pid) {
		// TODO Auto-generated method stub
		return ud.getAreaInfo(pid);
	}

}
