package com.github.luoyedaren.learnoop.singleton;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 * 静态内部类
 * 实现了延迟加载 线程安全
 */
public class ConnectionDemo3 {

	public static class Hold{
		private static ConnectionDemo3 connectionDemo3 = new ConnectionDemo3();
	}



	private ConnectionDemo3() {
	}

	public static ConnectionDemo3 getSigleton(){
		return Hold.connectionDemo3;
	}

}

