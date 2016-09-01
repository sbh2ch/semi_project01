package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import preview.PreviewDAO;
import preview.PreviewVO;

@WebServlet("/main")
public class MainController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PreviewDAO pDao = new PreviewDAO();
		String auth = req.getParameter("auth");
		if(auth != null){
			req.setAttribute("authFail", auth);
		}
		
		List<PreviewVO> pList = pDao.selectThree();
		req.setAttribute("pList", pList);

		RequestDispatcher rd = req.getRequestDispatcher("main.jsp");
		rd.forward(req, resp);
	}
}