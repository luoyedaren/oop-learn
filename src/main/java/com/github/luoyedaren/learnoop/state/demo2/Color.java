package com.github.luoyedaren.learnoop.state.demo2;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/24 0024. - 星期四
 * nickName louyedaren
 */
public enum Color {

	RED{
		@Override
		void change(Context context) {
			System.out.println(context);
			context.color = GREEN;
		}
	},GREEN{
		@Override
		void change(Context context) {
			System.out.println(context);
			context.color = YELLOW;

		}
	}, YELLOW{
		@Override
		void change(Context context) {
			System.out.println(context);
			context.color = RED;

		}
	};

	abstract void change(Context context);

}
