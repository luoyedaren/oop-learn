package com.github.luoyedaren.learnoop.bill.settlement;

import java.math.BigDecimal;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 */
public class BSettlement extends AbstractSettlement {

	@Override
	public BigDecimal caculate() {
		BigDecimal result = getMerchandiseValue()
				.subtract(getTotalPreferentialAmount())
				.add(getPlatformDiscount())
				.subtract(getDeliveryServiceFee())
				.subtract(getPlatformCommission())
				.add(getMerchandiseFreightCharge())
				.subtract(getJDDeliveryServiceFee());

		return result;
	}

	/**
	 * 结算金额 = 商品总金额 – 总优惠金额 + 平台优惠 - 配送服务费 - 三方平台佣金 - 京东到家取件服务费 + 商家收取运费
	 * @return
	 */


	@Override
	Boolean hock() {
		return null;
	}

	@Override
	public BigDecimal getPlatformCommission() {
		return BigDecimal.ZERO;
	}

}
