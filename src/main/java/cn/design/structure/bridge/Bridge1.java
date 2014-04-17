package cn.design.structure.bridge;

public class Bridge1 extends Bridge {

	@Override
	public void method() {
		getSource().method();
	}

	public static void main(String[] args) {
		Source s1 = new Source1();
		Bridge1 sub = new Bridge1();
		sub.setSource(s1);
		sub.method();
	}

}
