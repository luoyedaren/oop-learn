package com.github.luoyedaren.learnoop.billsettlment;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 */
public class BillCountTest {

	/**
	 * 结算金额 = 商品总金额 - 总优惠金额 + 平台优惠 – 平台佣金 - 配送服务费 + 商家收取运费
	 * 94      =    100   -   10      +   5     -    3   -   2        + 4
	 */
	@Test
	public void count() {
		Assert.assertThat(new BigDecimal(10),is(new BigDecimal(10)));
		BigDecimal result = getSettlementAmount();

		Assert.assertThat(result,is(new BigDecimal(94)));
	}


	private BigDecimal getMerchandiseFreightCharge() {
		return new BigDecimal(4);
	}

	private BigDecimal getDeliveryServiceFee() {
		return new BigDecimal(2);
	}

	private BigDecimal getPlatformCommission() {
		return new BigDecimal(3);
	}

	private BigDecimal getSettlementAmount() {
		return getMerchandiseValue().subtract(getTotalPreferentialAmount()).add(getPlatformDiscount())
				.subtract(getPlatformCommission()).subtract(getDeliveryServiceFee()).add(getMerchandiseFreightCharge());
	}

	private BigDecimal getPlatformDiscount() {
		return new BigDecimal(5);
	}

	private BigDecimal getTotalPreferentialAmount() {
		return new BigDecimal(10);
	}

	private BigDecimal getMerchandiseValue() {
		return new BigDecimal(100);
	}

	/**
	 * 结算金额 = 商品总金额 – 总优惠金额 + 平台优惠 - 配送服务费 - 三方平台佣金 - 京东到家取件服务费 + 商家收取运费
	 */
	@Test
	public void anotherCount() {

	}

	@Test
	public void BigDecimalSub() {
		Assert.assertThat(new BigDecimal(10).subtract(new BigDecimal(-10)),is(new BigDecimal(20)));
	}
}
