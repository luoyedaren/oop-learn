package com.github.luoyedaren.learnoop.bill.settlement;

import java.math.BigDecimal;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 */
public abstract class AbstractSettlement implements Settlement{

	/**
	 * A :结算金额 = 商品总金额 – 总优惠金额 + 平台优惠 - 配送服务费 - 三方平台佣金  + 商家收取运费 - 京东到家取件服务费
	 * B :结算金额 = 商品总金额 - 总优惠金额 + 平台优惠 - 配送服务费 – 平台佣金     + 商家收取运费
	 * C :结算金额 = 商品总金额 - 总优惠金额 + 平台优惠 – 平台佣金 - 配送服务费 + 商家收取运费；
	 * D :结算金额 = 商品总金额 – 总优惠金额 + 平台优惠 - 配送服务费 + 商家收取运费
	 * @return
	 */
	@Override
	public BigDecimal caculate(){
		BigDecimal result = getMerchandiseValue()
				.subtract(getTotalPreferentialAmount())
				.add(getPlatformDiscount())
				.subtract(getDeliveryServiceFee())
				.subtract(getPlatformCommission())
				.add(getMerchandiseFreightCharge())
				.subtract(getJDDeliveryServiceFee());

		return result;
	}

	public BigDecimal getJDDeliveryServiceFee(){
		return BigDecimal.ZERO;
	}
	abstract Boolean hock();


	public BigDecimal getMerchandiseFreightCharge() {
		return new BigDecimal(4);
	}

	public BigDecimal getDeliveryServiceFee() {
		return new BigDecimal(2);
	}

	/**
	 * 平台佣金：三方平台、自营平台
	 * @return
	 */
	abstract public BigDecimal getPlatformCommission();


	public BigDecimal getPlatformDiscount() {
		return new BigDecimal(5);
	}

	public BigDecimal getTotalPreferentialAmount() {
		return new BigDecimal(10);
	}

	public BigDecimal getMerchandiseValue() {
		return new BigDecimal(100);
	}
}
