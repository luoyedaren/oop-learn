package com.github.luoyedaren.learnoop.observer.demo1.domain;

import com.github.luoyedaren.learnoop.SpringBootBaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

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
		GameInfo.builder().homeTeam(huostonNBATeam).guestTeam(warriorNBATeam).build();
		huostonNBATeam.setGameStart(true);
	}
}