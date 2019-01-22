package com.github.luoyedaren.learnoop.decorator.demo1;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/22 0022. - 星期二
 * nickName louyedaren
 */
public class PureMilkTea extends AbstractMilkTea {
	@Override
	public String getDescription() {
		return super.getDescription()+","+"纯奶茶";
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("PureMilkTea{");
		sb.append('}').append(getDescription()).append("价钱: ").append(cost());
		return sb.toString();
	}
}
