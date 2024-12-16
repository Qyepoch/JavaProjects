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

public class FileWrite extends HttpServlet {
	public void doGet(HttpServletRequest request ,HttpServletResponse response)throws ServletException,IOException{
		response.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		String fileName = "content.txt";
		@SuppressWarnings("deprecation")
		String realPath = request.getRealPath(fileName);
		File file = new File(realPath);
		
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
		bufferWriter.write("计算机网络");
		bufferWriter.newLine();
		bufferWriter.write("计算机组成原理");
		bufferWriter.flush();
		bufferWriter.close();
		fileWriter.close();
	}
	public void doPost(HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException{
		res.getWriter().append("Hello doPost");
	}
}


