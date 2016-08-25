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

@WebServlet("/nameUpdate")
public class UpdateUsernameController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberDAO mDao = new MemberDAO();
		MemberVO user = (MemberVO) req.getSession().getAttribute("user");
		String newName = req.getParameter("newname");

		RequestDispatcher rd = req.getRequestDispatcher("/modAccount.jsp");
		
		user.setName(newName);
		
		mDao.updateNM(user);
		rd.forward(req, resp);
	}
}
