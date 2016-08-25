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
import status.StatusDAO;
import status.StatusVO;

@WebServlet("/record")
public class RecordController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberVO user = (MemberVO)req.getSession().getAttribute("user");
		StatusDAO sDao = new StatusDAO();
		List<StatusVO> gList = sDao.joinGuest("sbh2ch@nate.com");
		List<StatusVO> hList = sDao.joinHost("sbh2ch@nate.com");
		
		System.out.println(hList.get(0));
		
		req.setAttribute("gList", gList);
		req.setAttribute("hList", hList);
		
		
		
		RequestDispatcher rd = req.getRequestDispatcher("record.jsp");
		rd.forward(req, resp);
		
	}
}