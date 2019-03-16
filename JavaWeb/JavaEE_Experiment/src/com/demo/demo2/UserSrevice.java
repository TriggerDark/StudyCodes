package com.demo.demo2;

import java.util.List;

public interface UserSrevice {

	User getUserInfoService(String name);

	List<Area> getAreaInfoService(String pid);

}
