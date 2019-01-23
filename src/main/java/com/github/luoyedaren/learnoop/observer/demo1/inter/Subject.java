package com.github.luoyedaren.learnoop.observer.demo1.inter;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/23 0023. - 星期三
 * nickName louyedaren
 */
public interface Subject {
	boolean add(Observer observer);

	boolean remove(Observer observer);

	void notifyObserver();
}
