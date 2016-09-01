package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import status.StatusDAO;
import status.StatusVO;

@WebServlet("/apply")
public class ApplyGuestingController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int hostNo = Integer.parseInt(req.getParameter("hostNo"));
		String guestEmail = req.getParameter("guestEmail");
		Date checkIn = null;
		Date checkOut = null;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		StatusDAO sDao = new StatusDAO();
		StatusVO s = sDao.selectOne(hostNo);

		try {
			checkIn = sdf.parse(req.getParameter("checkIn"));
			checkOut = sdf.parse(req.getParameter("checkOut"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		s.setGuestEmail(guestEmail);
		s.setCheckIn(checkIn);
		s.setCheckOut(checkOut);
		s.setHostingStatus("A");
		
		System.out.println(s);
		
		sDao.hostingRequest(s);

		resp.sendRedirect("/semiProject01/detail?hostNo=" + hostNo);
	}

}
