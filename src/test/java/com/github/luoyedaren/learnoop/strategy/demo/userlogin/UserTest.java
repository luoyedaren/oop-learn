package com.github.luoyedaren.learnoop.strategy.demo.userlogin;

import com.github.luoyedaren.learnoop.BaseSpringTest;
import com.github.luoyedaren.learnoop.SpringBootBaseTest;
import com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.impl.WechatLoginBehaviour;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
public class UserTest extends SpringBootBaseTest {

	@Autowired
	WechatLoginBehaviour wechatLoginBehaviour;

	@Test
	public void login() {
		User u = new User();
		WechatAccount account = new WechatAccount();
		u.getAccounts().add(account);
		u.setLoginBehaviour(wechatLoginBehaviour);
		u.login();
	}
}