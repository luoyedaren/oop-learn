package com.github.luoyedaren.learnoop.singleton;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 * 饿汉法
 */
public class ConnectionDemo {
	private static final ConnectionDemo connectionDemo = new ConnectionDemo();


	private ConnectionDemo() {
	}

	public ConnectionDemo getInstance(){
		return connectionDemo;
	}
}
