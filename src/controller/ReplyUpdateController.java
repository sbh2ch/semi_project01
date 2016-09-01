package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reply.ReplyDAO;
import reply.ReplyVO;

@WebServlet("/replyUpdate")
public class ReplyUpdateController extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("no"));
		int hostNo = Integer.parseInt(request.getParameter("hostNo"));
		
		ReplyVO rvo = new ReplyVO();
		rvo.setContent(request.getParameter("content"));
		rvo.setReplyNo(hostNo);
		
		ReplyDAO dao = new ReplyDAO();
		dao.updateReply(rvo);
		
		response.sendRedirect("detail?replyNo=" +no);
	}
	
	
}
