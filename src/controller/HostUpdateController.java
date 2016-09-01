package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import detail.DetailDAO;
import detail.DetailVO;
import location.LocationDAO;
import location.LocationVO;
import preview.PreviewDAO;
import preview.PreviewVO;

@WebServlet("/hostUpdate")
public class HostUpdateController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		System.out.println("수정완료");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		int hostNo = Integer.parseInt(req.getParameter("hostNo"));
		System.out.println(req.getParameter("hostNo"));
		
		PreviewDAO pDAO = new PreviewDAO();
		DetailDAO dDAO = new DetailDAO();
		LocationDAO lDAO = new LocationDAO();
		// host 번호에 따른 데이터들 VO 추출.
		PreviewVO pVO = pDAO.selectOne(hostNo);
		DetailVO dVO = dDAO.selectOne(hostNo);
		LocationVO lVO = lDAO.selectOne(hostNo);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sDate = sdf.format(pVO.getStartDate());
		String eDate = sdf.format(pVO.getEndDate());
		
		req.setAttribute("p", pVO);
		req.setAttribute("d", dVO);
		req.setAttribute("l", lVO);
		req.setAttribute("sDate", sDate);
		req.setAttribute("eDate", eDate);
		req.setAttribute("istrue", "UpdateMode");
		RequestDispatcher rd = req.getRequestDispatcher("hostInfoForm.jsp");
		rd.forward(req, resp);
	}	
}
