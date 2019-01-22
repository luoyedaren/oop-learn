package com.github.luoyedaren.learnoop.bill.settlement.order;

import lombok.Data;

import java.math.BigDecimal;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/22 0022. - 星期二
 * nickName louyedaren
 */
@Data
public class Order{
	/**
	 * 支付方式 1：在线支付 2：货到付款
	 */
	private int payType;
	/**
	 * 结算方式 1：销售占比 2：毛利占比 3：零抽成
	 */
	private int caculateType;

	/**
	 * 订单渠道 1: a渠道  2： b渠道
	 */
	private int channel;

	public BigDecimal caculateAll() {
		if (getChannel() == 1) {
			return caculate();

		} else if (getChannel() == 2) {
			return caculate();

		} else {
			System.out.println("未知支付方式");
			return BigDecimal.ZERO;
		}

	}

	public BigDecimal caculate() {
		if (getCaculateType() == 1) {
			return caculateByPayType(getPayType());
		} else if (getCaculateType() == 2) {
			return caculateByPayType(getPayType());

		} else if (getCaculateType() == 3) {
			return caculateByPayType(getPayType());

		} else {
			System.out.println("未知的结算方式");
			return BigDecimal.ZERO;
		}
	}

	private BigDecimal caculateByPayType(int channel) {
		System.out.println("渠道: " + channel);
		return BigDecimal.ONE;
	}

}
