package com.github.luoyedaren.learnoop.strategy.demo.userlogin;

import com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter.LoginBehaviour;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Data
public class User {
	private LoginBehaviour loginBehaviour;
	private final List<Account> accounts = new ArrayList<>();

	public void login() {
		for (Account account : accounts) {
			System.out.println("开始登陆");
			loginBehaviour.login(account);
			System.out.println("结束登陆");
			System.out.println("-----------------------------");

		}
	}

	public void cleanAccount() {
		accounts.clear();
	}

}
