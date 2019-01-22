package com.github.luoyedaren.learnoop.decorator.demo1;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/22 0022. - 星期二
 * nickName louyedaren
 */
public abstract class AbstractMilkTea {
	private String description = "奶茶";

	public String getDescription() {
		return description;
	}

	public int cost(){
		return 10;
	}
}
