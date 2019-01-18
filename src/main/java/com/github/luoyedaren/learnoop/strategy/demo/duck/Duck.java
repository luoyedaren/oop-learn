package com.github.luoyedaren.learnoop.strategy.demo.duck;

import com.github.luoyedaren.learnoop.strategy.demo.duck.inter.Flyable;
import lombok.Data;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Data
public abstract class Duck {
	Flyable flyable;

	public void fly(){
		flyable.fly();
	}

}
