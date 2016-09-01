package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberVO;
import msg.MsgDAO;
import msg.Msg;

@WebServlet("/listSend")
public class ListSendController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MsgDAO dao = new MsgDAO();
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		
		List<Msg> list = dao.selectSend(user.getName());
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("msgSend.jsp");
		System.out.println("listSend 호출됌");
		rd.forward(request, response);

	}

}
