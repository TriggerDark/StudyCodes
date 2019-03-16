package com.demo.demo2;

import java.util.List;

public interface UserDao {

	User getUserInfo(String name);

	List<Area> getAreaInfo(String pid);

}
