package ltd.newbee.mall.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController 注解将类标记为一个 Spring MVC 控制器（Controller），负责处理 HTTP 请求并返回响应。它类似于 @Controller 注解，但专门为 RESTful 服务设计。
@RestController
public class JdbcController {
	
	//已经自动配置，可以通过@autowired注入进来
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	//新增一条记录
	@GetMapping("/insert")
	public String insert(String type, String name) {
		if(StringUtils.isEmpty(type) || StringUtils.isEmpty(name)) {
			return "参数异常";
		}
		String sql = "insert into jdbc_test(`ds_type`,`ds_name`) value(\"" + type + "\",\"" + name + "\")";
		jdbcTemplate.execute(sql);
		return "SQL执行完毕";
	}
	
	//删除一条记录
	@GetMapping("/delete")
	public String delete(int id) {
		if(id < 0) {
			return "参数异常";
		}
		String sql_1 = "select * from jdbc_test where ds_id = \"" + id + "\"";
		String sql_2 = "delete from jdbc_test where ds_id = \"" + id + "\"";
		List<Map<String, Object>> result = jdbcTemplate.queryForList(sql_1);
		if(CollectionUtils.isEmpty(result)){
			return "不存在该记录，删除失败！";
		}
		jdbcTemplate.execute(sql_2);
		return "SQL执行完毕！";
	}
	
	//修改记录
	@GetMapping("/update")
	public String update(int id, String type, String name) {
		if(id < 0 || StringUtils.isEmpty(name) || StringUtils.isEmpty(type)) {
			return "参数异常";
		}
		String sql = "select * from jdbc_test where ds_id = \"" + id + "\"";
		List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
		if(CollectionUtils.isEmpty(result)){
			return "不存在该记录，更新失败！";
		}
		String sql_2 = "update jdbc_test set ds_type = \"" + type + "\",ds_name =  \"" + name + "\" where ds_id = \""  + id +  "\"";
		jdbcTemplate.execute(sql_2);
		return "SQL执行完毕！";
	}
	
	@GetMapping("/queryAll")
	public List<Map<String, Object>> queryAll(){
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from jdbc_test");
		return list;
	}

}
