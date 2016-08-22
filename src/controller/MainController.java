package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/main")
public class MainController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String fb = req.getParameter("fb");
		System.out.println(name + " : " + email + " : " + fb);
		
		if (fb != null && fb.equals("N"))
			session.invalidate();
		else
			session.setAttribute("user", name);

		RequestDispatcher rd = req.getRequestDispatcher("main.jsp");
		rd.forward(req, resp);
	}
}
