package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import detail.DetailVO;
import file.FileVO;
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
		FileVO fVO = new FileVO();
		MemberVO mVO = new MemberVO();
		
	}	
}
