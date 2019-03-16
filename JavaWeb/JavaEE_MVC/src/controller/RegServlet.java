package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import model.UserService;

/**
 * ����ע�����󣬷ָ���Ӧ��model�����󣬲�����ע����
 * @author SuperStar
 *
 */

public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 2568932435947076244L;

	/*
	 * ��Ա����userService
	 * RegServlet��Ҫ����userService����������ע�������
	 */
	private UserService userService = new UserService();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setPhone(phone);
		user.setAddress(address);
		String message = userService.regist(user);
		if (message==null) {
			//�ض��򵽵�¼ҳ
			response.sendRedirect("login.jsp");
		} else {
			request.setAttribute("message", message);
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}
}