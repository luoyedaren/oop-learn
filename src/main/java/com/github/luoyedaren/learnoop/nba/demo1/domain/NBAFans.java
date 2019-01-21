package com.github.luoyedaren.learnoop.nba.demo1.domain;

import com.github.luoyedaren.learnoop.nba.demo1.inter.FansObserver;
import lombok.Data;
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

	public NBAFans() {
	}

	public NBAFans(String name) {
		this.name = name;
	}

	@Override
	public void notice(GameInfo gameInfo) {
		System.out.println(this.name+"看球：" + gameInfo);
	}

}
