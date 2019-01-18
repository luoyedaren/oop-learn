package com.github.luoyedaren.learnoop.observer.demo1.domain;

import com.github.luoyedaren.learnoop.observer.demo1.inter.FansObserver;
import lombok.Builder;
import lombok.Data;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/18 0018. - 星期五
 * nickName louyedaren
 */
@Component
@Data
public class HuostonNBATeam extends NBATeam {

	@Autowired
	FansObserver NBAFans;

	@Autowired
	FansObserver NBAFansTwo;

	@PostConstruct
	public void init(){
		List<FansObserver> fansObservers = super.getFansObservers();
		fansObservers.add(NBAFans);
		fansObservers.add(NBAFansTwo);
	}

	public HuostonNBATeam() {
		super("火箭队");
	}


}
