package com.demo.demo2;

import java.util.List;

public class UserSeviceImp implements UserSrevice{
	//��ȡDao�����
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
