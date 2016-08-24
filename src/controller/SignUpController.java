package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;
import member.MemberVO;

@WebServlet("/signUp")
public class SignUpController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberDAO mDao = new MemberDAO();

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		MemberVO user = mDao.selectOne(email);

		if (user != null) {
			resp.sendRedirect("/semiProject01/signUpForm?msg=Email is invalid");
		} else if (password.length() < 4) {
			resp.sendRedirect("/semiProject01/signUpForm?msg=Password is invalid");
		}
		user = new MemberVO(email, password, name, null);
		mDao.insertNM(user);

		resp.sendRedirect("/semiProject01/main");
	}

}
