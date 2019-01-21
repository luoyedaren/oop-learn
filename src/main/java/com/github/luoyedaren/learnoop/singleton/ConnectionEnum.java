package com.github.luoyedaren.learnoop.singleton;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 * 不易理解
 */
public enum ConnectionEnum {
	INSTANCE;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		String name = ConnectionEnum.INSTANCE.getName();
		System.out.println(name);
	}
}
