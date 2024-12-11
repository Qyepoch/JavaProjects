package ltd.newbee.mall.dao;

import java.util.List;
import ltd.newbee.mall.entity.TestUser;

//与实体文件相对应
public interface TestUserDao {

	List<TestUser> findAllUser();
	int insertUser(TestUser user);
	int updUser(TestUser user);
	int delUser(Integer id);
}


