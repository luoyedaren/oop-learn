package com.github.luoyedaren.learnoop.strategy.demo.userlogin;

import lombok.Data;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Data
public class WechatAccount extends Account {
	private String openId;
	private String unionId;
}
