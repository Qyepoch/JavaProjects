package ltd.newbee.mall;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NewbeeMallApplicationTests {
	//注入数据源对象
	@Autowired
	private DataSource defaultDataSource;
	
	@Test
	public void DataSourceTest() throws SQLException {
		//获取数据库连接对象
		Connection connection = defaultDataSource.getConnection();
		System.out.println("获取连接：");
		//判断连接对象是否为空
		System.out.println(connection!=null);
		connection.close();
	}
	
	@Test
	void contextLoads() {
	}

}
