package com.github.luoyedaren.learnoop.strategy.demo.duck.inter.impl;

import com.github.luoyedaren.learnoop.strategy.demo.duck.inter.Flyable;
import lombok.Data;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Data
public class LittleFlyable implements Flyable {

	@Override
	public void fly() {
		System.out.println("小幅度飞行！");
	}
}
