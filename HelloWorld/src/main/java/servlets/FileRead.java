package servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileRead extends HttpServlet {
	public void doGet(HttpServletRequest request ,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		response.setCharacterEncoding("gb2312");
		PrintWriter out = response.getWriter();
		String fileName = "content.txt";
		@SuppressWarnings("deprecation")
		String realPath = request.getRealPath(fileName);
		File file = new File(realPath);

		if(file.exists()) {
			FileReader reader = new FileReader(file);
			BufferedReader bufferReader = new BufferedReader(reader);
			String line = null;
			while((line = bufferReader.readLine())!=null) {
				out.print("<font size='4'>" + line +"</font><br>");
			}
		} else {
			out.print("文件不存在");
		}
	}
	public void doPost(HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException{
		res.getWriter().append("Hello doPost");
	}
}


