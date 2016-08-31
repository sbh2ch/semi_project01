package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import reply.ReplyDAO;

@WebServlet("/replyDelete")
public class ReplyDeleteController extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int no = Integer.parseInt(request.getParameter("no"));
		int hostNo = Integer.parseInt(request.getParameter("hostNo"));
		
		ReplyDAO dao = new ReplyDAO();
		dao.deleteReply(no);
		
		response.sendRedirect("detail?replyNo=" +no);
	}
	
	
}
