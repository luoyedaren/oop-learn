package com.github.luoyedaren.learnoop.singleton;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 * 饿汉法
 */
public class ConnectionDem4 {
	private ConnectionDem4 connectionDemo;


	private ConnectionDem4() {
	}

	public ConnectionDem4 getInstance(){
		if (connectionDemo == null) {
			synchronized (ConnectionDem4.class){
				if (connectionDemo == null) {
					connectionDemo =  new ConnectionDem4();
				}
			}
		}
		return connectionDemo;
	}
}
