package com.github.luoyedaren.learnoop.strategy.demo.duck;

import com.github.luoyedaren.learnoop.strategy.demo.duck.inter.impl.LittleFlyable;
import com.github.luoyedaren.learnoop.strategy.demo.duck.inter.impl.NoFlyable;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
public class DuckFlyMain {
	public static void main(String[] args) {
		Duck homeDuck = new HomeDuck();
		homeDuck.setFlyable(new LittleFlyable());
		homeDuck.fly();
		homeDuck.setFlyable(new NoFlyable());
		homeDuck.fly();

	}
}
