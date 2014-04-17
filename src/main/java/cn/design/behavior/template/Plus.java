package cn.design.behavior.template;

public class Plus extends AbstractTemplate {

	@Override
	int calculate(int a, int b) {
		return a * 2 + b * 1;
	}

}
