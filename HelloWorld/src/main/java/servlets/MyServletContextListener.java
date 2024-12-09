package servlets;

import java.io.*;
import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener,ServletContextAttributeListener {
	private ServletContext context = null;
	public void contextInitialized(ServletContextEvent s) {
		this.context = s.getServletContext();
		print("ServletContext初始化......");
	}
	public void contextDestroyed(ServletContextEvent s) {
		this.context = null;
		print("ServletContext被释放......");
	}
	public void attributeAdded(ServletContextAttributeEvent sa) {
		print("删除ServletContext对象的某一个属性：attributeRemoved(" + sa.getName() + ",");
	}
	public void attributeReplaced(ServletContextAttributeEvent sa) {
		print("更改ServletContext对象的某一个属性：attributeReplaced(" + sa.getName() + "," + sa.getValue() + ",");
	}
	
	private void print(String message) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileOutputStream("D:\\output.txt",true));
			out.println(new java.util.Date().toLocaleString() + "ContextListener:" + message);
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void attributeRemoved(ServletContextAttributeEvent sa) {
		print("删除Servlet Context对象的某一个属性:attributeRemoved"	+ sa.getName());
		
	}
}
