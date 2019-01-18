package com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.impl;

import com.github.luoyedaren.learnoop.strategy.demo.userlogin.domain.Account;
import com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.LoginBehaviour;
import org.springframework.stereotype.Component;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Component
public class NamePassWordLoginBehaviour implements LoginBehaviour {
	@Override
	public void login(Account user) {
		System.out.println("用户名密码登陆");
		System.out.println(user);
	}

}
