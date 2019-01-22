package com.github.luoyedaren.learnoop.bill.settlement;

import java.math.BigDecimal;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 */
public class CSettlement extends AbstractSettlement {


	/**
	 * :结算金额 = 商品总金额 - 总优惠金额 + 平台优惠 – 平台佣金 - 配送服务费 + 商家收取运费；
	 * 结算金额 = 商品总金额 - 总优惠金额 + 平台优惠 – 平台佣金 - 配送服务费 + 商家收取运费
	 * 94      =    100   -   10      +   5     -    3   -   2        + 4
	 */
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





	@Override
	Boolean hock() {
		return null;
	}

	@Override
	public BigDecimal getPlatformCommission() {
		return BigDecimal.valueOf(3);
	}


}
