package com.github.luoyedaren.learnoop.observer.demo1.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Data
public class GameInfo {
	private NBATeam homeTeam;
	private NBATeam guestTeam;
	private Date date = new Date();



	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("GameInfo{");
		sb.append("homeTeam=").append(homeTeam.getTeamName());
		sb.append(", guestTeam=").append(guestTeam.getTeamName());
		sb.append(",start time is ").append(date);
		sb.append('}');
		return sb.toString();
	}
}
