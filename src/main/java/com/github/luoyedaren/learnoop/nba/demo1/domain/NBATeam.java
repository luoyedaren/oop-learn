package com.github.luoyedaren.learnoop.nba.demo1.domain;

import com.github.luoyedaren.learnoop.nba.demo1.inter.FansObserver;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Data
public abstract class NBATeam {
	final private String teamName;
	private boolean start;
	public NBATeam(String teamName) {
		this.teamName = teamName;
	}

	private GameInfo gameInfo;
	private List<FansObserver> fansObservers = new ArrayList<>();


	public void add(FansObserver nbaFans) {
		this.fansObservers.add(nbaFans);
	}

	public void remove(FansObserver nbaFans) {
		this.fansObservers.remove(nbaFans);
	}

	public abstract boolean isGameStart(GameInfo gameInfo);


	public void notifyFans() {
		if (isGameStart(gameInfo)) {
			for (FansObserver fansObserver : fansObservers) {
				fansObserver.notice(gameInfo);
			}
		} else {
			System.out.println("比赛还没有开始");

		}
	}

}
