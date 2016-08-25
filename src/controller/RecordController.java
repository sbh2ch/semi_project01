package controller;

import java.io.IOException;
import java.util.List;

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
		sDao.delete(4);
		List<StatusVO> list = sDao.selectHostAll("gecko@na.com");
		List<StatusVO> hList = sDao.selectGuestAll("sbh2ch@nate.com");
		System.out.println(list.size()+" : "+hList.size());
		System.out.println("end");
	}
}
