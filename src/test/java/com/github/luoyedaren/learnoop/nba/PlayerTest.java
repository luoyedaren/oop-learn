package com.github.luoyedaren.learnoop.nba;

import com.github.luoyedaren.learnoop.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/17 0017. - 星期四
 * nickName louyedaren
 */
public class PlayerTest extends BaseTest {
	@Test
	public void playNBA() {
		Player player = new Player();
		Assert.assertThat(true,is(player.shot()));
		Assert.assertThat(false,is(player.shot()));
	}
}
