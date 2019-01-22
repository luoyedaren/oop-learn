package com.github.luoyedaren.learnoop.bill.settlement;

import java.math.BigDecimal;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/22 0022. - 星期二
 * nickName louyedaren
 */
public class Context {
	private Settlement settlement;

	public BigDecimal caculate() {
		return settlement.caculate();
	}

	public Settlement getSettlement() {
		return settlement;
	}

	public void setSettlement(Settlement settlement) {
		this.settlement = settlement;
	}
}
