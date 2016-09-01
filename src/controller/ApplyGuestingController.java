package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import status.StatusDAO;
import status.StatusVO;

@WebServlet("/apply")
public class ApplyGuestingController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int hostNo = Integer.parseInt(req.getParameter("hostNo"));
		String guestEmail = req.getParameter("guestEmail");
		
//guestEamil=sbh2ch%40nate.com&hostNo=1&checkIn=2016-08-23&checkOut=2016-08-24&ppl=1
		StatusDAO sDao = new StatusDAO();
		StatusVO s = sDao.selectOne(hostNo);
		
		
		
	}
	
}
