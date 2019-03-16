package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.UserService;


public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 8955066535791860937L;
	private UserService userService = new UserService();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
		String message = userService.login(username, password);
		if (message == null) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("index.jsp");
		} else {
			request.setAttribute("message", message);
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}
}
