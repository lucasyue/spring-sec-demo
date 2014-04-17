package cn.design.behavior.interpreter;

public class Plus implements Expression {

	@Override
	public double interpreter(Context context) {
		return context.getNumb1() + context.getNumb2();
	}

}
