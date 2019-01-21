package com.github.luoyedaren.learnoop.singleton;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 *
 * 单线程
 */
public class ConnectionDemo2 {
	private static final ConnectionDemo2 connectionDemo = null;


	private ConnectionDemo2() {
	}

	public ConnectionDemo2 getInstance(){
		if (connectionDemo == null) {
			return new ConnectionDemo2();
		}
		return connectionDemo;
	}
}
