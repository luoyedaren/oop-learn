package com.github.luoyedaren.learnoop.observer.demo1;

import com.github.luoyedaren.learnoop.observer.demo1.inter.Observer;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/23 0023. - 星期三
 * nickName louyedaren
 */
public class WeatherDataMain {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		weatherData.setHumidity(20);
		weatherData.setPressure(100);
		weatherData.setTemperature(30);

		Observer normalDisplay = new NormalDisplay();
		weatherData.add(normalDisplay);

		weatherData.change(30, 13, 10);



	}
}
