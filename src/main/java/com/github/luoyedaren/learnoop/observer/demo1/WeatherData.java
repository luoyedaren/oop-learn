package com.github.luoyedaren.learnoop.observer.demo1;

import com.github.luoyedaren.learnoop.observer.demo1.inter.Subject;
import com.github.luoyedaren.learnoop.observer.demo1.inter.Observer;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/23 0023. - 星期三
 * nickName louyedaren
 */
@Data
public class WeatherData implements Subject {
	private float temperature;
	private float humidity;
	private float pressure;

	private final List<Observer> observers = new ArrayList<>();

	public void change(float temperature,float humidity,float pressure) {
		// 天气变化
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObserver();
	}

	@Override
	public boolean add(Observer observer) {
		if (!observers.contains(observer)) {
			return observers.add(observer);
		} else {
			return true;
		}

	}

	@Override
	public boolean remove(Observer observer) {
		if (observers.contains(observer)) {
			return observers.remove(observer);
		} else {
			return true;
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer observer1 : observers) {
			observer1.update(this);
		}
	}
}
