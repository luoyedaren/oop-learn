package com.github.luoyedaren.web.service;

import com.github.luoyedaren.SpringBootBaseTest;
import com.github.luoyedaren.web.entity.UserEntity;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.CoreMatchers.is;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 */
public class UserServiceTest extends SpringBootBaseTest {
	@Autowired
	UserService userService;

	@Test
	public void findOneTest() {
		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName("mike");
		userEntity.setLastName("jea");
		userEntity.setId(2);
		Assert.assertThat("返回一样的",userService.getOne(2),is(userEntity));
	}
}
