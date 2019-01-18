package com.github.luoyedaren.learnoop.observer.demo1.domain;

import com.github.luoyedaren.learnoop.observer.demo1.inter.FansObserver;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Data
@Service
public class NBAFans implements FansObserver {
	private String name = "球迷1";


	@Override
	public void notice(GameInfo gameInfo) {
		System.out.println(this.name+"看球：" + gameInfo);
	}

}
