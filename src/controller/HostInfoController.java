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
import member.MemberVO;
import preview.PreviewDAO;
import preview.PreviewVO;
import status.StatusDAO;
import status.StatusVO;

@WebServlet("/hostInfo")
public class HostInfoController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		DetailVO dVO = new DetailVO();
		LocationVO lVO = new LocationVO();
		PreviewVO pVO = new PreviewVO();
		StatusVO sVO = new StatusVO();
		//MemberVO mVO = new MemberVO();
		
		PreviewDAO pDAO = new PreviewDAO();
		DetailDAO dDAO = new DetailDAO();
		LocationDAO lDAO = new LocationDAO();
		StatusDAO sDAO = new StatusDAO();
						
		//mVO.setEmail(request.getParameter("hostEmailH"));
		SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
		String path = sdf.format(new Date());
		ServletContext context = request.getServletContext(); 
		String realPath = context.getRealPath("/upload");
		realPath = realPath + path;
		
		File f = new File(realPath);
		if(!f.exists()){f.mkdirs();}				
//				
//		System.out.println("realPath : " + realPath);
		//String realPath = "C:/java86/workspace/ServletJsp/WebContent/upload";
		MultipartRequest mRequest = new MultipartRequest(
				request, 
				realPath,			// 서버에 저장할 패스 
				1024 * 1024 * 100,	// 저장할 파일의 최대 사이즈 
				"UTF-8");			// 요청에 대한 인코딩 처리방식.
									// 파일이름이 같을 경우의 정책, 생략하면 디폴트
				
		//String msg = mRequest.getParameter("msg");
		//System.out.println("msg : " + msg);
		// 데이터들 집어넣어 주기
		
		// 3단계 데이터 - 요금과날짜
		// 미리보기에서 번호 자동생성이 있어서 부득이하게 3단계부터 해줌
		pVO.setRegDate(new Date());
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		try
		{
			pVO.setStartDate(sdf.parse(mRequest.getParameter("startDateH")));
			pVO.setEndDate(sdf.parse(mRequest.getParameter("endDateH")));
		} catch (ParseException e)
		{
			e.printStackTrace();
			System.out.println("데이터 변환에 무언가 문제가 발생");
		}
		pVO.setHouseCost(Integer.parseInt(mRequest.getParameter("costH")));
		pVO.setHouseDesc(mRequest.getParameter("houseDescH"));
		pVO.setEmail(mRequest.getParameter("hostEmailH"));
		
		// 4단계-파일 집어넣기
		File file = mRequest.getFile("img");		
		// 사용자가 선택한 파일이 있는지 체크
		if(file != null)
		{
			// 사용자가 선택한 파일명
			String oriFileName = mRequest.getOriginalFileName("img");
//			System.out.println("oriFileName : " + oriFileName);
			// 실제 서버에 저장된 파일명
			String realFileName = mRequest.getFilesystemName("img");
//			System.out.println("realFileName : " + realFileName);
			// 파일의 사이즈
			long size = file.length();
//			System.out.println("fileSize : " + size);
			pVO.setImgPath(path);
			pVO.setImgOriName(oriFileName);
			pVO.setImgRealName(realFileName);
			//pDAO.insertFile(pVO);			
		}
		int hostNo = pDAO.insert(pVO);	// PreviewDAO 에서 시퀀스 번호를 따오므로 일단 먼저 해준다
		// 1단계 데이터 - Detail
		//mRequest.getParameter("")
		dVO.setHostNo(hostNo);//dao에서 산출
		dVO.setHouseType(mRequest.getParameter("houseTypeH"));
		dVO.setRoomType(mRequest.getParameter("roomTypeH"));
		dVO.setHouseCapacity(Integer.parseInt(mRequest.getParameter("houseCapacityH")));
		dVO.setHouseRoom(Integer.parseInt(mRequest.getParameter("houseRoomH")));
		dVO.setHouseBed(Integer.parseInt(mRequest.getParameter("houseBedH")));
		dVO.setHouseBath(Integer.parseInt(mRequest.getParameter("houseBathH")));
		dVO.setHouseDetail(mRequest.getParameter("hostDetailH"));
//		System.out.println(dVO.toString());
		dDAO.insert(dVO);
		// 1-테스트용sysout
//		System.out.println(mRequest.getParameter("houseTypeH"));
//		System.out.println(mRequest.getParameter("roomTypeH"));
//		System.out.println(Integer.parseInt(mRequest.getParameter("houseCapacityH")));
//		System.out.println(Integer.parseInt(mRequest.getParameter("houseRoomH")));
//		System.out.println(Integer.parseInt(mRequest.getParameter("houseBedH")));
//		System.out.println(Integer.parseInt(mRequest.getParameter("houseBathH")));
//		System.out.println(mRequest.getParameter("hostDetailH"));
		// 2단계 데이터 - Location
		lVO.setHostNo(hostNo);
		lVO.setNation(mRequest.getParameter("nationH"));
		lVO.setAddr(mRequest.getParameter("addrH"));
		lVO.setZipCode(mRequest.getParameter("zipCodeH"));
		lVO.setDetailAddr(mRequest.getParameter("detailAddrH"));
		lVO.setxPoint(mRequest.getParameter("xPointH"));
		lVO.setyPoint(mRequest.getParameter("yPointH"));
		lDAO.insert(lVO);
		// test sysout
//		System.out.println(mRequest.getParameter("nationH"));
//		System.out.println(mRequest.getParameter("addrH"));
//		System.out.println(mRequest.getParameter("zipCodeH"));
//		System.out.println(mRequest.getParameter("detailAddrH"));
//		System.out.println(mRequest.getParameter("xPointH"));
//		System.out.println(mRequest.getParameter("yPointH"));
		// 4단계 데이터 - 이미지와 설명
//		sVO.setCheckIn(checkIn);
//		sVO.setCheckOut(checkOut);
//		sVO.setStartDate(startDate);
//		sVO.setEndDate(endDate);
//		sVO.setImgPath(imgPath);
//		sVO.setImgOriName(imgOriName);
//		sVO.setImgRealName(imgRealName);
//		sVO.setHouseDesc(houseDesc);
//		sVO.setHouseCost(houseCost);
		sVO.setHostNo(hostNo);
		sVO.setHostEmail(mRequest.getParameter("hostEmailH"));
		sDAO.insert(sVO);
		// 입력 완료되면 바로 호스팅 내역 페이지로 보내버림.
		StatusDAO sDao = new StatusDAO();
		List<StatusVO> gList = sDao.joinGuest(mRequest.getParameter("hostEmailH"));
		List<StatusVO> hList = sDao.joinHost(mRequest.getParameter("hostEmailH"));
		request.setAttribute("gList", gList);
		request.setAttribute("hList", hList);

		RequestDispatcher rd = request.getRequestDispatcher("record.jsp");
		rd.forward(request, response);
	}	
}
