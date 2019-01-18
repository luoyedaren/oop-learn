package com.github.luoyedaren.learnoop.strategy.demo.userlogin.inter;

import com.github.luoyedaren.learnoop.strategy.demo.userlogin.domain.Account;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
public interface LoginBehaviour<T extends Account> {
	void login(T account);
}
