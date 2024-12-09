package com.jan.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		try {
			// 加载驱动，获取的运行时类，JVM虚拟机中的类模板
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 获取connection
			String url = "jdbc:mysql://localhost:3306/yss?useUnicode=true&characterEncoding=UTF-8";// 设置编码格式
			String user = "root";
			String pwd = "064516";
			
			Connection connection = DriverManager.getConnection(url, user, pwd);
			Test test = new Test();
//			int result = test.add(connection);
//			int result = test.delete(connection, 2);
			test.query(connection, 1);
//			System.out.println(result);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 增
	public int add(Connection connection) {
		String sql = "insert into yss_student(id, name, age, score) values(2, '樊振东', 32, 89)";
		PreparedStatement statement;
		int result = 0;
		try {
			statement = connection.prepareStatement(sql);
			result = statement.executeUpdate();
			connection.close();
			statement.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	
	// delete
	public int delete(Connection connection,  int id) {
		String sql = "delete from yss_student where id=" + id;
		Statement statement;
		int result = 0;
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(sql);
			connection.close();
			statement.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	// query
	public int query(Connection connection,  int id) {
		String sql = "select * from yss_student where id=" + id;
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			// 解析结果集
			while(result.next()) {
				int ids = result.getInt(id); // 可以通过下标，也可以通过名字取"id"
				String name = result.getString(2);
				int age = result.getInt(3);
				int score = result.getInt(4);
				System.out.println("id:" + ids + " " + "name:" + name + " " + "age:" + age + " " + "score:" + score);
			}
			result.close();
			connection.close();
			statement.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return id; 
	}
		

}
