package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchHost")
public class HostSearchController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String destAddr = req.getParameter("destination");
		String departDate = req.getParameter("departDate");
		String destDate = req.getParameter("destDate");
		int findCapacity = Integer.parseInt(req.getParameter("findCapacity"));
		System.out.println("검색에 진입: 목표지:"+destAddr+", 시작일:"+departDate+", 종료일:"+destDate+", 인원:"+findCapacity);
	}	
}
