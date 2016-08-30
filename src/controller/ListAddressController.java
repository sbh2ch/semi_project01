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
import msgBoard.MsgDAO;
import msgBoard.MsgVO;

@WebServlet("/listAddress")
public class ListAddressController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MsgDAO dao = new MsgDAO();
		MemberVO user = (MemberVO)request.getSession().getAttribute("user");
		
		List<MsgVO> list = dao.selectAddress(user.getEmail());

		request.setAttribute("list", list);

		RequestDispatcher rd = request.getRequestDispatcher("msgAdress.jsp");
		rd.forward(request, response);

	}

}
