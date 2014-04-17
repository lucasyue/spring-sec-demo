package cn.design.behavior.strategy;

public class Minus extends AbstractStategy implements ICacluatorStategy {

	@Override
	public int calclulate(String str) {
		int rs[] = split(str, "-");
		return rs[0] - rs[1];
	}

}
