package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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

@WebServlet("/hostDelete")
public class HostDeleteController extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		PreviewDAO pDAO = new PreviewDAO();
		DetailDAO dDAO = new DetailDAO();
		LocationDAO lDAO = new LocationDAO();
		StatusDAO sDAO = new StatusDAO();
		
		int hostNo = Integer.parseInt(req.getParameter("hostNo"));
		pDAO.delete(hostNo);
		dDAO.delete(hostNo);
		lDAO.delete(hostNo);
		sDAO.delete(hostNo);
		// 삭제후 다시 메인화면으로 갱신
		pDAO = new PreviewDAO();
		List<PreviewVO> pList = pDAO.selectThree();
		req.setAttribute("pList", pList);
		
		RequestDispatcher rd = req.getRequestDispatcher("main.jsp");
		rd.forward(req, resp);
	}	
}
