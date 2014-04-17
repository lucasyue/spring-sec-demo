package cn.design.behavior.state;

public class Context {
	private State state;

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void method() {
		if ("s1".equals(state.getValue())) {
			state.method1();
		} else if ("s2".equals(state.getValue())) {
			state.method2();
		}
	}
}
