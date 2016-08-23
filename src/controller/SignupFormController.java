package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signUpForm")
public class SignupFormController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg = req.getParameter("msg");
		if(msg != null)
			req.setAttribute("msg", msg);
		
		RequestDispatcher rd = req.getRequestDispatcher("signupForm.jsp");
		rd.forward(req, resp);
	}
	
}
