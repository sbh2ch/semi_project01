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
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		int no = Integer.parseInt(request.getParameter("hostNo"));
		 
		 ReplyVO rvo = new ReplyVO();
		 ReplyDAO dao = new ReplyDAO();
		  
		 rvo.setHostNo(no);
		 rvo.setName(request.getParameter("name"));
		 rvo.setEmail(request.getParameter("email"));
		 rvo.setContent(request.getParameter("content"));
		 
		 dao.insertReply(rvo);
		 
		 response.sendRedirect("detail?no=" +no);
	}
	
	
}
