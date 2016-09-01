package controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

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
		/* 파일 입력과 멀티파트 폼 대응을 위한 mRequest 선언부 */
		SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
		String path = sdf.format(new Date());
		ServletContext context = req.getServletContext(); 
		String realUPath = context.getRealPath("/upload");
		realUPath = realUPath + path;
		
		File f = new File(realUPath);
		if(!f.exists()){f.mkdirs();}				
		
		MultipartRequest mRequest = new MultipartRequest(
				req, 
				realUPath,			
				1024 * 1024 * 100,	
				"UTF-8");
		
		int hostNo = Integer.parseInt(mRequest.getParameter("hostNoH"));
		System.out.println("파라미터:"+mRequest.getParameter("hostNoH"));
		System.out.println("파싱:"+hostNo);
		PreviewDAO pDAO = new PreviewDAO();
		DetailDAO dDAO = new DetailDAO();
		LocationDAO lDAO = new LocationDAO();
		// 기존 파일을 먼저 삭제하기 위한 조회
		PreviewVO pVO = pDAO.selectOne(hostNo);
		String realPath = req.getServletContext().getRealPath("/upload") + pVO.getImgPath() +"\\"+ pVO.getImgRealName();
		File delFile = new File(realPath);
		delFile.delete();
		// 여기까지 기존 파일 삭제
		// 이제부터 입력 데이터 다시 호출..?
		pVO = new PreviewVO();
		DetailVO dVO = new DetailVO();
		LocationVO lVO = new LocationVO();
		

					
									
		/* 1단계 데이터 삽입 */
		dVO.setHostNo(hostNo);
		dVO.setHouseType(mRequest.getParameter("houseTypeH"));
		dVO.setRoomType(mRequest.getParameter("roomTypeH"));
		dVO.setHouseCapacity(Integer.parseInt(mRequest.getParameter("houseCapacityH")));
		dVO.setHouseRoom(Integer.parseInt(mRequest.getParameter("houseRoomH")));
		dVO.setHouseBed(Integer.parseInt(mRequest.getParameter("houseBedH")));
		dVO.setHouseBath(Integer.parseInt(mRequest.getParameter("houseBathH")));
		dVO.setHouseDetail(mRequest.getParameter("hostDetailH"));
		dDAO.update(dVO);
		/* 2단계 데이터 삽입 */
		lVO.setHostNo(hostNo);
		lVO.setNation(mRequest.getParameter("nationH"));
		lVO.setAddr(mRequest.getParameter("addrH"));
		lVO.setZipCode(mRequest.getParameter("zipCodeH"));
		lVO.setDetailAddr(mRequest.getParameter("detailAddrH"));
		lVO.setxPoint(mRequest.getParameter("xPointH"));
		lVO.setyPoint(mRequest.getParameter("yPointH"));
		lDAO.update(lVO);
		/* 3단계 데이터 삽입 */
		pVO.setHostNo(hostNo);
		pVO.setRegDate(new Date());
		SimpleDateFormat psdf = new SimpleDateFormat("yyyy-MM-dd");
		try
		{
			pVO.setStartDate(psdf.parse(mRequest.getParameter("startDateH")));
			pVO.setEndDate(psdf.parse(mRequest.getParameter("endDateH")));
		} catch (ParseException e)
		{
			e.printStackTrace();
			System.out.println("데이터 변환에 무언가 문제가 발생");
		}
		pVO.setHouseCost(Integer.parseInt(mRequest.getParameter("costH")));
		pVO.setHouseDesc(mRequest.getParameter("houseDescH"));
		/* 4단계-파일 집어넣기 */
		File file = mRequest.getFile("img");		
		// 사용자가 선택한 파일이 있는지 체크
		if(file != null)
		{
			// 사용자가 선택한 파일명
			String oriFileName = mRequest.getOriginalFileName("img");
			// 실제 서버에 저장된 파일명
			String realFileName = mRequest.getFilesystemName("img");
			// 파일의 사이즈
			long size = file.length();
			pVO.setImgPath(path);
			pVO.setImgOriName(oriFileName);
			pVO.setImgRealName(realFileName);
			//pDAO.insertFile(pVO);			
		}
		pDAO.update(pVO);		
		
		System.out.println("수정완료");
		// 메인 페이지로 보내기
		List<PreviewVO> pList = pDAO.selectThree();
		req.setAttribute("pList", pList);
		
		RequestDispatcher rd = req.getRequestDispatcher("main.jsp");
		rd.forward(req, resp);
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
