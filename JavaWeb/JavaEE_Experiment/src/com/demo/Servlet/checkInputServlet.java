package com.demo.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

@WebServlet("/checkInputServlet")
public class checkInputServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un = request.getParameter("un");
		String pd = request.getParameter("pd");
		JSONObject jo = new JSONObject();
		if (("zhangsan").equals(un) && ("123456").equals(pd)) {
			jo.put("message", "校验成功");
		} else {
			jo.put("message", "校验失败");
		}
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8"); 
		response.getWriter().write(jo.toString());
	}

}
