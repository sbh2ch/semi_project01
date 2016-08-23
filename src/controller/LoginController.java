package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.MemberDAO;
import member.MemberVO;

@WebServlet("/login/login")
public class LoginController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		MemberDAO mDao = new MemberDAO();
		MemberVO user = null;
		HttpSession session = req.getSession();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String fb = req.getParameter("fb");
		
		user = mDao.selectOne(email);
		if(fb.equalsIgnoreCase("Y")){
			if(user == null){
				mDao.insertFB(new MemberVO(email, null, name, "Y"));
				user = mDao.selectOne(email);
			} 
			session.setAttribute("user", user);
		}else{
			if(user != null){
				if(user.getPassword().equals(req.getParameter("password"))){
					session.setAttribute("user", user);
				}else{
					res.sendRedirect("/semiProject01/login/loginForm");
				}
				
			}
		}
		
		res.sendRedirect("/semiProject01/main");
	}

}
