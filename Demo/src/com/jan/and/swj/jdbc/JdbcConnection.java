package com.jan.and.swj.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

// jdbc 测试链接
public class JdbcConnection {
	public void TestConnection() throws Exception{
		
		
		/*数据库连接池
		 * 说明：数据厍连接池是个容器，负责分配、管理数据库连接(Connection)
		 * 它允许应用程序重复使用一个现有的数据库连接，而不是再重新建立一个;
		 * 释放空闲时间超过最大空闲时间的数据库连接来避免因为没有释放数据库连接而引起的数据库连接遗漏
		 * 好处:1.资源重用、2.提升系统响应速度、3.避免数据库连接逮漏
		 * Druid是目前最好的数据库连接池（阿里巴巴开发）
		 */
		
//		//1.读取配置文件信息
//		Properties properties = new Properties();
//		// this类是DruidQuickStart
//		InputStream in = DruidQuickStart.class.getClassLoader().getResourceAsStream("druid.properties");
//		properties.load(in);
//		// 2.创建数据库连接池对象
//		DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//		// 3.从数据库连接池中获取一个连接
//		Connection connection = dataSource.getConnection();
		
		//1、注册驱动（确定要使用哪个数据库）
        Class.forName("com.mysql.cj.jdbc.Driver");
 
        //2、连接数据库（获取到一个数据库连接对象）
        String url = "jdbc:mysql://127.0.0.1:3306/yss?serverTimezone=Asia/Shanghai";
        Connection connection = DriverManager.getConnection(url, "root", "064516");
 
        //3.编写sql语句
        String sql = "select * from yss_student";
 
        //4、把sql语句发送给数据库（数据库执行sql代码，并返回通知结果）
        Statement statement = connection.createStatement();//基于数据库连接对象，创建一个操作数据库的对象。
        ResultSet resultSet = statement.executeQuery(sql);
 
        //5、处理sql执行结果
        System.out.println("========================");
        while (resultSet.next()) {
            System.out.print(resultSet.getInt("id") + "\t");
            System.out.print(resultSet.getString("name") + "\t");
            System.out.print(resultSet.getString("age") + "\t");
            System.out.println(resultSet.getString("score"));
            System.out.println("========================");
        }
 
        //释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
	public static void main(String[] args) throws Exception{
		JdbcConnection test = new JdbcConnection();
		test.TestConnection();
	}
}
