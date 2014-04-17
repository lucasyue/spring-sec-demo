package cn.design.behavior.state;

public class State {
	private String value;

	public State(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	void method1() {
		System.out.println("do thing1");
	}

	void method2() {
		System.out.println("do thing2");
	}
}
