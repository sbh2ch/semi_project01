package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;
import member.MemberVO;

@WebServlet("/pwUpdate")
public class UpdatePasswordController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberDAO mDao = new MemberDAO();
		MemberVO user = (MemberVO) req.getSession().getAttribute("user");

		String oldPassword = req.getParameter("oldpw");
		String newPassword = req.getParameter("newpw");

		RequestDispatcher rd = req.getRequestDispatcher("/modAccount.jsp");
		if (!user.getPassword().equals(oldPassword) || newPassword.length() < 5) {
			req.setAttribute("msg", "Invaild password");
			rd.forward(req, resp);
		}else {
			
			user.setPassword(newPassword);
			mDao.updateNM(user);
			
			rd.forward(req, resp);
		}
	}
}