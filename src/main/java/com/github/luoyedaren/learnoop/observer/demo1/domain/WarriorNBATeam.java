package com.github.luoyedaren.learnoop.observer.demo1.domain;

import lombok.Builder;
import org.springframework.stereotype.Service;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Builder
@Service
public class WarriorNBATeam extends NBATeam {
	public WarriorNBATeam() {
		super("勇士队");
	}

}
