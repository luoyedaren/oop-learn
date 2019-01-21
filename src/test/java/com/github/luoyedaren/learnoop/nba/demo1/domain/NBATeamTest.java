package com.github.luoyedaren.learnoop.nba.demo1.domain;

import com.github.luoyedaren.SpringBootBaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
public class NBATeamTest extends SpringBootBaseTest {

	@Autowired
	HuostonNBATeam huostonNBATeam;
	@Autowired
	WarriorNBATeam warriorNBATeam;

	@Test
	public void notifyFans() {
		GameInfo gameInfo = new GameInfo();
		gameInfo.setHomeTeam(huostonNBATeam);
		gameInfo.setGuestTeam(warriorNBATeam);
		huostonNBATeam.setGameInfo(gameInfo);
		huostonNBATeam.notifyFans();

	}
}