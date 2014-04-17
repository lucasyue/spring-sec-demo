package cn.design.structure.decorator;

public class Decorator implements Sourceable {
	private Sourceable sourceable;

	Decorator(Sourceable sourceable) {
		this.sourceable = sourceable;
	}

	@Override
	public void method() {
		System.out.println("before");
		sourceable.method();
		System.out.println("after");
	}

}
