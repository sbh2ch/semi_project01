package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import detail.DetailDAO;
import location.LocationDAO;
import preview.PreviewDAO;
import preview.PreviewVO;
import status.StatusDAO;

@WebServlet("/deleteBoard")
public class DeleteBoardController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int hostNo = Integer.parseInt(req.getParameter("hostNo"));
		DetailDAO dDao = new DetailDAO();
		StatusDAO sDao = new StatusDAO();
		PreviewDAO pDao = new PreviewDAO();
		LocationDAO lDao = new LocationDAO();
		PreviewVO p = pDao.selectOne(hostNo);
		
		dDao.delete(hostNo);
		sDao.delete(hostNo);
		lDao.delete(hostNo);
		pDao.delete(p, req.getServletContext().getRealPath("/upload") + p.getImgPath() +"\\"+ p.getImgRealName());

		resp.sendRedirect("/semiProject01/main");
	}

}
