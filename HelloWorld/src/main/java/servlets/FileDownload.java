package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileDownload extends HttpServlet {
	public void doGet(HttpServletRequest request ,HttpServletResponse response)throws ServletException,IOException{
		try {
			String fname =  "content.txt";
			response.setCharacterEncoding("UTF-8");
			fname = java.net.URLEncoder.encode(fname, "UTF-8");
			response.setHeader("Content-Disposition", "attachment;filename=" + fname);
			response.setContentType("text/plain");	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void doPost(HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException{
		res.getWriter().append("Hello doPost");
	}
}


