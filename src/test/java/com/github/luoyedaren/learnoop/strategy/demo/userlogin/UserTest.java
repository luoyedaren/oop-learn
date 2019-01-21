package com.github.luoyedaren.learnoop.strategy.demo.userlogin;

import com.github.luoyedaren.SpringBootBaseTest;
import com.github.luoyedaren.learnoop.strategy.demo.userlogin.domain.FaceAccount;
import com.github.luoyedaren.learnoop.strategy.demo.userlogin.domain.User;
import com.github.luoyedaren.learnoop.strategy.demo.userlogin.domain.WechatAccount;
import com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.impl.FaceLoginBehaviour;
import com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.impl.WechatLoginBehaviour;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
public class UserTest extends SpringBootBaseTest {

	@Autowired
	WechatLoginBehaviour wechatLoginBehaviour;
	@Autowired
	FaceLoginBehaviour faceLoginBehaviour;


	@Test
	public void login() {
		WechatAccount account = new WechatAccount();
		User user = new User();
		user.getAccounts().add(account);
		user.setLoginBehaviour(wechatLoginBehaviour);
		user.login();
	}

	@Test
	public void faceLogin() {
		User user = new User();
		user.getAccounts().add(FaceAccount.builder().faceId("test face").build());
		user.setLoginBehaviour(faceLoginBehaviour);
		user.login();
	}
}