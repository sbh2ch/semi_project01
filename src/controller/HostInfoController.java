package controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import detail.DetailVO;
import location.LocationVO;
import member.MemberVO;
import preview.PreviewVO;
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
		MemberVO mVO = new MemberVO();
				
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
		// 1단계 데이터 - Detail
		//mRequest.getParameter("")
		int hostNo = 0;	// dao로 sql쏴서 시퀀스로부터 얻어온 번호를 디테일,로케이션,미리보기,현황VO에 뿌려주기
		dVO.setHostNo(hostNo);//dao에서 산출
		dVO.setHouseType(mRequest.getParameter("houseTypeH"));
		dVO.setRoomType(mRequest.getParameter("roomTypeH"));
		dVO.setHouseCapacity(Integer.parseInt(mRequest.getParameter("houseCapacityH")));
		dVO.setHouseRoom(Integer.parseInt(mRequest.getParameter("houseRoomH")));
		dVO.setHouseBed(Integer.parseInt(mRequest.getParameter("houseBedH")));
		dVO.setHouseBath(Integer.parseInt(mRequest.getParameter("houseBathH")));
		dVO.setHouseDetail(mRequest.getParameter("hostDetailH"));
		// 1-테스트용sysout
		System.out.println(mRequest.getParameter("houseTypeH"));
		System.out.println(mRequest.getParameter("roomTypeH"));
		System.out.println(Integer.parseInt(mRequest.getParameter("houseCapacityH")));
		System.out.println(Integer.parseInt(mRequest.getParameter("houseRoomH")));
		System.out.println(Integer.parseInt(mRequest.getParameter("houseBedH")));
		System.out.println(Integer.parseInt(mRequest.getParameter("houseBathH")));
		System.out.println(mRequest.getParameter("hostDetailH"));
		// 2단계 데이터 - Location
		lVO.setHostNo(hostNo);
		lVO.setNation(mRequest.getParameter("nationH"));
		lVO.setAddr(mRequest.getParameter("addrH"));
		lVO.setZipCode(mRequest.getParameter("zipCodeH"));
		lVO.setDetailAddr(mRequest.getParameter("detailAddrH"));
		lVO.setxPoint(mRequest.getParameter("xPointH"));
		lVO.setyPoint(mRequest.getParameter("yPointH"));
		// test sysout
		System.out.println(mRequest.getParameter("nationH"));
		System.out.println(mRequest.getParameter("addrH"));
		System.out.println(mRequest.getParameter("zipCodeH"));
		System.out.println(mRequest.getParameter("detailAddrH"));
		System.out.println(mRequest.getParameter("xPointH"));
		System.out.println(mRequest.getParameter("yPointH"));
		// 3단계 데이터 - 요금과날짜
		// 4단계 데이터 - 이미지와 설명
		// 4단계-파일 집어넣기
		File file = mRequest.getFile("img");
		
		
		// 사용자가 선택한 파일이 있는지 체크
		if(file != null)
		{
			// 사용자가 선택한 파일명
			String oriFileName = mRequest.getOriginalFileName("img");
			System.out.println("oriFileName : " + oriFileName);
			// 실제 서버에 저장된 파일명
			String realFileName = mRequest.getFilesystemName("img");
			System.out.println("realFileName : " + realFileName);
			// 파일의 사이즈
			long size = file.length();
			System.out.println("fileSize : " + size);
			pVO.setImgPath(path);
			pVO.setHostNo(hostNo);
			pVO.setImgOriName(oriFileName);
			pVO.setImgRealName(realFileName);
			pVO.setImgSize(size);
			//pDAO.insertFile(pVO);			
		}
		
		//response.sendRedirect("list");
	}	
}
