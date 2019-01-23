package com.github.luoyedaren.learnoop.state.demo1;

import lombok.Data;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/23 0023. - 星期三
 * nickName louyedaren
 */
@Data
public class Light {
	private State state;
	private static int count = 0;


	public void change() {
		state.change(this);
	}

	public Light(State state) {
		this.state = state;
	}

	public void work() {
		while (count++ < 10) {
			change();
		}
	}
}
