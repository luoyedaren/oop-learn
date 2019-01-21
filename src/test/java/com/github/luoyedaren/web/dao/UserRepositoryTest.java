package com.github.luoyedaren.web.dao;

import com.github.luoyedaren.web.entity.UserEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 */

public class UserRepositoryTest extends DaoTest{
	@Autowired
	private UserRepository userRepository;

	@Test
	public void connectTest() {
		Assert.assertThat(userRepository,notNullValue());
	}

	@Test
	@Rollback(false)
	@Repeat(1)
	public void saveTest() throws InterruptedException {

		UserEntity user = new UserEntity();
		user.setFirstName("mike");
		user.setLastName("jea");
		Assert.assertThat(userRepository.save(user),is(user));
	}

	@Test
	public void getOneTest() {
		Assert.assertThat(userRepository.getOne(Integer.valueOf(1)),notNullValue());
		UserEntity user = new UserEntity();
		user.setFirstName("mike");
		user.setLastName("jea");
		user.setId(1);
		Assert.assertThat(userRepository.getOne(Integer.valueOf(1)),is(user));
	}
}
