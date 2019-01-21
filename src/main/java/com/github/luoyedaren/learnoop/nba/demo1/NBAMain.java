package com.github.luoyedaren.learnoop.nba.demo1;

import com.github.luoyedaren.learnoop.nba.demo1.domain.*;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
public class NBAMain {
	public static void main(String[] args) {

		NBATeam huostonNBATeam = new HuostonNBATeam();

//		huostonNBATeam.add(NBAFans.builder().name("球迷1").build());
//		huostonNBATeam.add(NBAFans.builder().name("球迷2").build());
		huostonNBATeam.notifyFans();


//		GameInfo gameInfo = new GameInfo();
//		gameInfo.setHomeTeam(huostonNBATeam);
//		gameInfo.setGuestTeam(WarriorNBATeam.builder().build());
//		huostonNBATeam.setGameInfo(gameInfo);
//		System.out.println("开始比赛");
//		huostonNBATeam.setGameStart(true);

	}
}
