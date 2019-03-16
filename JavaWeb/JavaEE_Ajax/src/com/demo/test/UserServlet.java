package com.demo.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.UserService;
import com.demo.serviceImp.UserServiceImp;
import com.demo.user.User;
import com.google.gson.Gson;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String province = req.getParameter("uname");
		String provinceID = "";
		if(province.equals("江苏省")) {
			provinceID = "jscity";
			System.out.println("请求信息：" + province);
		}
		// 获取业务层数据
		UserService us = new UserServiceImp();
		User s = us.getUserInfoService(provinceID);
		resp.getWriter().write(new Gson().toJson(s));
		//System.out.println(s);
//		resp.getWriter().write("{province: '" + province
//				+ "', city: '" + s.getCity() + "'}");
	}
}
