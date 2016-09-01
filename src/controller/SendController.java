package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import member.MemberVO;
import msg.MsgDAO;
import msg.Msg;

@WebServlet("/send")
public class SendController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");

		Msg msg = new Msg();
		msg.setSender(user.getName());
		System.out.println(user.getName() + " : "+ request.getParameter("addressee")+ ":" +request.getParameter("message"));
		msg.setAddressee(request.getParameter("addressee"));
		msg.setMessage(request.getParameter("message"));

		MsgDAO dao = new MsgDAO();
		dao.insertSend(msg);
		
		response.sendRedirect("/semiProject01/listAddress");
	}

}
