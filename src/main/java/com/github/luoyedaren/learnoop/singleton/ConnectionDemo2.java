package com.github.luoyedaren.learnoop.singleton;

import org.springframework.util.Assert;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 * 懒加载
 * 单线程
 */
public class ConnectionDemo2 {
	private static ConnectionDemo2 connectionDemo = null;


	private ConnectionDemo2() {
	}

	public static ConnectionDemo2 getInstance() {
		if (connectionDemo == null) {
			connectionDemo = new ConnectionDemo2();
		}
		return connectionDemo;
	}

	public static void main(String[] args) {
		ConnectionDemo2 instance1 = ConnectionDemo2.getInstance();
		ConnectionDemo2 instance2 = ConnectionDemo2.getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
		Assert.notNull(instance1, "空的");
		Assert.isTrue(instance1.equals(instance2), "相同");
	}
}
