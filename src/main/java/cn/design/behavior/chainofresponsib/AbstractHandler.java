package cn.design.behavior.chainofresponsib;

public abstract class AbstractHandler implements Handler {
	private Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
