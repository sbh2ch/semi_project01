package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login/login")
public class LoginController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String fb = req.getParameter("fb");
		String password = req.getParameter("password");
		
		System.out.println(name + " : " + email + " : " + fb);
		
		if (fb != null && fb.equals("N"))
			session.invalidate();
		else
			session.setAttribute("user", name);
		
		res.sendRedirect("/semiProject01/main");
	}

}
