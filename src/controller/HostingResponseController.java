package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import status.StatusDAO;
import status.StatusVO;

@WebServlet("/response")
public class HostingResponseController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String res = req.getParameter("res");
		int hostNo = Integer.parseInt(req.getParameter("hostNo"));

		StatusDAO sDao = new StatusDAO();
		StatusVO s = sDao.selectOne(hostNo);

		if (res.equals("accept") && s.getHostingStatus().equals("A")) { //confirm
			s.setHostingStatus("C");
		} else { //reject
			s.setGuestEmail(null);
			s.setStartDate(null);
			s.setEndDate(null);
			s.setHostingStatus("W");
		}
		
		resp.sendRedirect("/semiProject01/detail?hostNo="+hostNo);
	}
}
