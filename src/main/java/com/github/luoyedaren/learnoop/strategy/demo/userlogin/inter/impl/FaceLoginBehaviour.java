package com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.impl;

import com.github.luoyedaren.learnoop.strategy.demo.userlogin.domain.FaceAccount;
import com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.LoginBehaviour;
import org.springframework.stereotype.Component;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 * 刷脸登陆
 */
@Component
public class FaceLoginBehaviour implements LoginBehaviour<FaceAccount> {
	@Override
	public void login(FaceAccount user) {
		System.out.println(user.getFaceId());
		System.out.println("刷脸登陆");
	}
}
