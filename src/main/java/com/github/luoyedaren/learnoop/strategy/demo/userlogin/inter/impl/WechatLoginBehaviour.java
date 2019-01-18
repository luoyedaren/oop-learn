package com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.impl;

import com.github.luoyedaren.learnoop.strategy.demo.userlogin.WechatAccount;
import com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.LoginBehaviour;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
		if (user instanceof WechatAccount) {
			WechatAccount wechatUser = (WechatAccount) user;
			System.out.println(user.getOpenId());
			System.out.println(user);
		} else {
			System.out.println("不是微信登陆");
		}
	}
}
