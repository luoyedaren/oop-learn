package com.github.luoyedaren.learnoop.strategy.demo.userlogin;

import com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.impl.NamePassWordLoginBehaviour;
import com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.impl.WechatLoginBehaviour;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
public class UserLoginMain {
	public static void main(String[] args) {
		Account account = new WebAccount();
		account.setLoginName("pc");
		account.setPassword("123");
		User user = new User();
		user.setLoginBehaviour(new NamePassWordLoginBehaviour());
		user.getAccounts().add(account);
		user.login();

		WechatAccount wechatAccoun = new WechatAccount();
		wechatAccoun.setOpenId("1");
		wechatAccoun.setUnionId("11");
		user.cleanAccount();
		user.getAccounts().add(wechatAccoun);
		user.setLoginBehaviour(new WechatLoginBehaviour());
		user.login();


	}
}
