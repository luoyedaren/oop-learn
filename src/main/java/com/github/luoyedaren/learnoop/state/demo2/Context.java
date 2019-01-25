package com.github.luoyedaren.learnoop.state.demo2;

import lombok.Data;

import java.util.concurrent.TimeUnit;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/24 0024. - 星期四
 * nickName louyedaren
 */
@Data
public class Context {
	Color color;

	public Context(Color color) {
		this.color = color;
	}

	public static void main(String[] args) {
		Context context = new Context(Color.RED);
		context.run();

	}

	public void run (){
		while (true){
			try {
				TimeUnit.SECONDS.sleep(1L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			color.change(this);
		}
	}

}
