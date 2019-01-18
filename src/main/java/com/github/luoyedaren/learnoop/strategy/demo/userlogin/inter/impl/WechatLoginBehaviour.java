package com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.impl;

import com.github.luoyedaren.learnoop.strategy.demo.userlogin.domain.WechatAccount;
import com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.LoginBehaviour;
import org.springframework.stereotype.Component;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Component
public class WechatLoginBehaviour implements LoginBehaviour<WechatAccount> {

	@Override
	public void login(WechatAccount user) {
		System.out.println("微信登陆");
		WechatAccount wechatUser = (WechatAccount) user;
		System.out.println(user.getOpenId());
		System.out.println(user);
	}
}
