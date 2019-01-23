package com.github.luoyedaren.learnoop.state.demo1;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/23 0023. - 星期三
 * nickName louyedaren
 */
public class LightMain {
	public static void main(String[] args) {
		State state = new GreenState();
		Light light = new Light(state);
//		light.change();
//		light.change();
//		light.change();
		light.work();
	}
}
