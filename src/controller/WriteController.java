package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import msgBoard.MsgDAO;
import msgBoard.MsgVO;

@WebServlet("/msg/write")
public class WriteController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MsgVO msg = new MsgVO();
		msg.setSender(request.getParameter("sender"));
		msg.setAddressee(request.getParameter("addressee"));
		msg.setMessege(request.getParameter("messege"));

		MsgDAO dao = new MsgDAO();
		int no = dao.insert(msg);
	}

}
