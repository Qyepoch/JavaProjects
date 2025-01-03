package ltd.newbee.mall.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ltd.newbee.mall.dao.TestUserDao;
import ltd.newbee.mall.entity.TestUser;

@RestController
public class MyBatisController {

	@Resource
	TestUserDao UserDao;
	
	//查询所有用户
	@GetMapping("/users/mybatis/queryAll")
	public List<TestUser> queryAll() {
		return UserDao.findAllUser();
	}
	
	//add
	@GetMapping("/users/mybatis/insert")
	public Boolean insert(String name, String password) {
		if(StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
			return false;
		}
		TestUser user = new TestUser();
		user.setName(name);
		user.setPassword(password);
		return UserDao.insertUser(user) > 0;
	}
	
	// edit
	@GetMapping("/users/mybatis/edit")
	public Boolean edit(Integer id, String name, String password) {
		if(id == null || id < 1 || StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
			return false;
		}
		TestUser user = new TestUser();
		user.setId(id);
		user.setName(name);
		user.setPassword(password);
		return UserDao.updUser(user) > 0;
	}
	
	//del
	@GetMapping("/users/mybatis/delete")
	public Boolean delete(Integer id) {
		if(id == null || id < 1) {
			return false;
		}
		return UserDao.delUser(id) > 0;
	}
}
