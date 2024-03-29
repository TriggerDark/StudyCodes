package com.demo.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/xmlHttp")
public class AjaxServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cstr1 = "province";
		String cstr2 = "sdcity";
		String cstr3 = "jscity";
		String cstr4 = "zjcity";
		String str1 = "Province";
		String str2 = "City";
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String un=req.getParameter("un");
		String pd=req.getParameter("pd");
		String s = un + ":" + pd + ":" + req.getMethod();
		ArrayList<String> string = readData.data(cstr1, str1);
		resp.getWriter().write(s+string.get(0));
	}
}
