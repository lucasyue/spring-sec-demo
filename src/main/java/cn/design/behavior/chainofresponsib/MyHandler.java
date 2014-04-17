package cn.design.behavior.chainofresponsib;

public class MyHandler extends AbstractHandler {
	private String name;

	public MyHandler(String name) {
		this.name = name;
	}

	@Override
	public void operation() {
		System.out.println(this.name + " is operation");
		if (this.getHandler() != null) {
			this.getHandler().operation();
		}
	}

}
