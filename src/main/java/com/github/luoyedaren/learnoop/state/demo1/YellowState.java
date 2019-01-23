package com.github.luoyedaren.learnoop.state.demo1;

import java.util.concurrent.TimeUnit;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/23 0023. - 星期三
 * nickName louyedaren
 */
public class YellowState implements State{
	@Override
	public void change(Light light) {
		System.out.println("黄灯亮");
		try {
			TimeUnit.SECONDS.sleep(4L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		light.setState(new RedState());
	}
}
