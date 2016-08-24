package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;
import member.MemberVO;

@WebServlet("/deleteAccount")
public class DeleteAccountController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberDAO mDao = new MemberDAO();
		MemberVO user = (MemberVO) req.getSession().getAttribute("user");

		mDao.delete(user.getEmail());
		resp.sendRedirect("/semiProject01/main");
	}
}
