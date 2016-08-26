package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import detail.DetailDAO;
import member.MemberDAO;
import preview.PreviewDAO;
import status.StatusDAO;
import status.StatusVO;

@WebServlet("/detail")
public class DetailController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int hostNo = Integer.parseInt(req.getParameter("hostNo"));
		DetailDAO dDao = new DetailDAO();
		StatusDAO sDao = new StatusDAO();
		PreviewDAO fDao = new PreviewDAO();
		MemberDAO mDao = new MemberDAO();
		StatusVO s = sDao.selectOne(hostNo);
		req.setAttribute("host", mDao.selectOne(s.getHostEmail()));
		req.setAttribute("d", dDao.selectOne(hostNo));
		req.setAttribute("s", s);
		req.setAttribute("p", fDao.selectOne(hostNo));

		RequestDispatcher rd = req.getRequestDispatcher("detail.jsp");
		rd.forward(req, resp);
	}
}
