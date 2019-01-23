package com.github.luoyedaren.learnoop.observer.demo1.inter;

import com.github.luoyedaren.learnoop.observer.demo1.WeatherData;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/23 0023. - 星期三
 * nickName louyedaren
 */
public interface Observer {
	void update(WeatherData weatherData);
}
