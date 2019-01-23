package com.github.luoyedaren.learnoop.observer.demo1;

import com.github.luoyedaren.learnoop.observer.demo1.inter.Display;
import com.github.luoyedaren.learnoop.observer.demo1.inter.Observer;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/23 0023. - 星期三
 * nickName louyedaren
 */
public class NormalDisplay implements Observer,Display {
	private WeatherData weatherDate;
	@Override
	public void update(WeatherData weatherDate) {
		this.weatherDate = weatherDate;
		display();

	}

	@Override
	public void display() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("气温：").append(weatherDate.getTemperature())
				.append("，湿度: ").append(weatherDate.getHumidity())
				.append(", 气压： ").append(weatherDate.getPressure());
		System.out.println(stringBuilder.toString());
	}
}
