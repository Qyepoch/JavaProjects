package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {
	public void doGet(HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException{
		res.getWriter().append("Hello doGet");
	}
	public void doPost(HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException{
		res.getWriter().append("Hello doPost");
	}
}


