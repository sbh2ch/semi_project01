package controller;

import java.io.IOException;
import java.io.PrintWriter;

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
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{			
		/*int no = Integer.parseInt(request.getParameter("hostNo"));
		 
		 ReplyVO rvo = new ReplyVO();
		 ReplyDAO dao = new ReplyDAO();
		  
		 rvo.setHostNo(no);
		 rvo.setName(request.getParameter("name"));
		 rvo.setEmail(request.getParameter("email"));
		 rvo.setContent(request.getParameter("content"));
		 
		 dao.insertReply(rvo);
		 
		 response.sendRedirect("detail?no=" +no);*/
		response.setContentType("text/plain; charset=utf-8");
		int hostNo = Integer.parseInt(request.getParameter("hostNo"));
		String email = request.getParameter("senderEmail");
		String content = request.getParameter("content");
		String name = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		String json = "";
		json += "[{\"name\": \""+name+"\", \"email\": \""+email+"\", \"content\": \""+content+"\"}]";
		out.print(json);
		out.close();
		
		response.sendRedirect("detail.jsp?hostNo="+hostNo);
	}
}
