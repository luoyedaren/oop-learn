package com.github.luoyedaren.learnoop.observer.demo1.domain;

import com.github.luoyedaren.learnoop.observer.demo1.inter.FansObserver;
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

	public NBATeam(String teamName) {
		this.teamName = teamName;
	}

	private GameInfo gameInfo;
	private boolean gameStart;
	private List<FansObserver> fansObservers = new ArrayList<>();


	public void add(FansObserver nbaFans) {
		this.fansObservers.add(nbaFans);
	}

	public void remove(FansObserver nbaFans) {
		this.fansObservers.remove(nbaFans);
	}

	public void setGameStart(boolean gameStart) {
		this.gameStart = gameStart;
		if (gameStart) {
			notifyFans();
		}
	}

	public void notifyFans() {
		if (gameStart) {
			for (FansObserver fansObserver : fansObservers) {
				fansObserver.notice(gameInfo);
			}
		} else {
			System.out.println("比赛还没有开始");

		}
	}

}
