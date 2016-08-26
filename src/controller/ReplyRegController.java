package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reply.ReplyDAO;
import reply.ReplyVO;

@WebServlet("/replyReg")
public class ReplyRegController extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	int no = Integer.parseInt(request.getParameter("hostNo"));
		ReplyVO rvo = new ReplyVO();
		rvo.setHostEmail("email");
		rvo.setContent("content");
		rvo.setName("jin mother");
		rvo.setReplyEmail("fuckjin");
		
		ReplyDAO dao = new ReplyDAO();
		dao.insertReply(rvo);
	
		RequestDispatcher rd = request.getRequestDispatcher("reply.jsp");
		rd.forward(request, response);
	}
}
