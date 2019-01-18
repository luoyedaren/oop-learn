package com.github.luoyedaren.learnoop.strategy.demo.userlogin.domain;

import lombok.Data;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Data
public abstract class Account {
	private String loginName;
	private String password;
}
