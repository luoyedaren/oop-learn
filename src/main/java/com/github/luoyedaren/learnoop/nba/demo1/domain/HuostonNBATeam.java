package com.github.luoyedaren.learnoop.nba.demo1.domain;

import com.github.luoyedaren.learnoop.nba.demo1.inter.FansObserver;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.IntStream;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Component
@Data
public class HuostonNBATeam extends NBATeam {


	@PostConstruct
	public void init(){
		List<FansObserver> fansObservers = super.getFansObservers();
		IntStream.range(1,10).forEach(value -> {
			fansObservers.add(new NBAFans("球迷"+value));

		});
	}

	public HuostonNBATeam() {
		super("火箭队");
	}

	@Override
	public boolean isGameStart(GameInfo gameInfo) {
		return gameInfo.getHomeTeam().equals(this);
	}
}
