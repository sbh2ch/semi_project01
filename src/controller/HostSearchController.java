package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import location.LocationDAO;
import member.MemberVO;
import preview.FindVO;
import preview.PreviewDAO;

@WebServlet("/searchHost")
public class HostSearchController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		MemberVO user = (MemberVO) req.getSession().getAttribute("user");
		FindVO fVO = new FindVO();
		fVO.setMyEmail(user.getEmail());
		fVO.setDestAddr(req.getParameter("destination"));
		fVO.setDepartDate(req.getParameter("departDate"));
		fVO.setDestDate(req.getParameter("destDate"));
		fVO.setFindCapacity(req.getParameter("findCapacity"));
		PreviewDAO pDAO = new PreviewDAO();
		LocationDAO lDAO = new LocationDAO();
		List<FindVO> resultL = pDAO.findDest(fVO);
		for(int i = 0 ; i < resultL.size() ; i++)
		{
			System.out.println("hostNo:"+resultL.get(i).getHostNo());
			System.out.println("hostNo:"+resultL.get(i).getRegDate());
			System.out.println("hostNo:"+resultL.get(i).getImgPath());
			System.out.println("hostNo:"+resultL.get(i).getImgRealName());
			System.out.println("hostNo:"+resultL.get(i).getHouseDesc());
			System.out.println("hostNo:"+resultL.get(i).getHouseCost());
			System.out.println("hostNo:"+resultL.get(i).getAddr());
			System.out.println("hostNo:"+resultL.get(i).getxPoint());
			System.out.println("hostNo:"+resultL.get(i).getyPoint());
			System.out.println("=======================================================");
		}
		// 검색된 hostNo 들로 해당하는 데이터들을 긁어옴
		// PreviewVO의 hostNo, regDate, imgPath, imgRealName, houseDesc, houseCost
		// LocationVO의 addr, xPoint, yPoint
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		List<PreviewVO> pList = pDAO.selectAll();
//		List<LocationVO> lList = lDAO.selectAll();
//		for(int i = 0 ; i < resultL.size() ; i++)
//		{
//			//System.out.println("리설트번호:"+resultL.get(i));
//			for(int j = 0 ; j < pList.size() ; j++)
//			{
//				if(pList.get(j).getHostNo() == resultL.get(i) && lList.get(j).getHostNo() == resultL.get(i))
//				{
////					System.out.println("전체호스트넘:"+pList.get(j).getHostNo()+"검출호스트넘:"+resultL.get(i));
////					System.out.println("리설트사이즈:"+resultL.size());
////					System.out.println("hostNo:"+pList.get(j).getHostNo());
////					System.out.println("cost:"+pList.get(j).getHouseCost());
////					System.out.println("path:"+pList.get(j).getImgPath());	
////					System.out.println("X좌표:"+lList.get(j).getxPoint());
////					System.out.println("Y좌표:"+lList.get(j).getyPoint());
////					System.out.println("===========================================================");
//					String temp = pList.get(j).getHostNo()+"!;!"+sdf.format(pList.get(j).getRegDate())+"!;!"
//								+ pList.get(j).getImgPath()+"!;!"+pList.get(j).getImgRealName()+"!;!"
//								+ pList.get(j).getImgRealName()+"!;!"+pList.get(j).getHouseDesc()+"!;!"
//								+ pList.get(j).getHouseCost()+"!;!"+lList.get(j).getAddr()+"!;!"
//								+ lList.get(j).getxPoint()+"!;!"+lList.get(j).getyPoint();
//					System.out.println(temp);
//					ResultVO rVO = new ResultVO();
//					rVO.set
//				}
//			}
//		}
		req.setAttribute("resultList", resultL);
		RequestDispatcher rd = req.getRequestDispatcher("MapSelectView.jsp");
		rd.forward(req, resp);
		/*Member m = new Member();
		m.setName("홍길동");
		m.setAge(25);
		
		// 5. to : 오브젝트를 json 으로.
		//    from : json을 오브젝트로.
		String result = gson.toJson(m);	// String 타입으로 반환해줌
		System.out.println(result);		// {"name":"홍길동","age":25} 으로 된 json 객체로 자동변환.
*/		
		
		/*Gson gson = new Gson();
		String json = "[";
		for(int i = 0 ; i < resultL.size() ; i++)
		{
			if(i < resultL.size()-1){
				json += "{\"hostNo\": \""+fVO.getMyEmail()+""\", \"age\": 33},";
			}else
			{
				json += "{\"name\": \"홍길동\", \"age\": 33}";
			}
		}
		json += "]";
		System.out.println("검색에 진입: 내메일:"+fVO.getMyEmail()+",목표지:"+fVO.getDestAddr()+
				", 시작일:"+fVO.getDepartDate()+", 종료일:"+fVO.getDestDate()+", 인원:"+fVO.getFindCapacity());
		
		resp.setContentType("text/plain; charset=utf-8");
		req.setAttribute("findSon", json);
		RequestDispatcher rd = req.getRequestDispatcher("MapSelectView.jsp");
		rd.forward(req, resp);*/
		//PrintWriter out = resp.getWriter();
		//out.print(json);
		//out.close();
	}	
}