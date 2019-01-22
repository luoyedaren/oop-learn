package com.github.luoyedaren.learnoop.decorator.demo1;

import org.junit.Test;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/22 0022. - 星期二
 * nickName louyedaren
 */
public class AbstractMilkTeaTest {

	@Test
	public void cost() {
		AbstractMilkTea milkTea = new PureMilkTea();
		System.out.println(milkTea);
		milkTea = new MilkRedTeaDecorator(milkTea);
		System.out.println(milkTea);
		milkTea = new PearlDecorator(milkTea);
		System.out.println(milkTea);

	}
}