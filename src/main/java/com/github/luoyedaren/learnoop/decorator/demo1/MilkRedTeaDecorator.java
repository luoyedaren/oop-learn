package com.github.luoyedaren.learnoop.decorator.demo1;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/22 0022. - 星期二
 * nickName louyedaren
 */
public class MilkRedTeaDecorator extends AbstractMilkTeamDecorator {
	private AbstractMilkTea abstractMilkTea;

	public MilkRedTeaDecorator(AbstractMilkTea abstractMilkTea) {
		this.abstractMilkTea = abstractMilkTea;
	}

	@Override
	public String getDescription() {
		return abstractMilkTea.getDescription()+"，红茶，";
	}

	@Override
	public int cost() {
		return abstractMilkTea.cost()+10;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("PureMilkTea{");
		sb.append('}').append(getDescription()).append(",价钱: ").append(cost());
		return sb.toString();
	}
}
