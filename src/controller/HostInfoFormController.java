package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberVO;

@WebServlet("/hostInfoForm")
public class HostInfoFormController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		MemberVO user = (MemberVO) request.getSession().getAttribute("user");
		String uEmail = user.getEmail();
		request.setAttribute("email", uEmail);
		request.setAttribute("istrue", "InsertMode");
		RequestDispatcher rd = request.getRequestDispatcher("hostInfoForm.jsp");
		rd.forward(request, response);
	}	
}
