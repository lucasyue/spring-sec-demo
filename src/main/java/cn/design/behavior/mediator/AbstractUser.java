package cn.design.behavior.mediator;

public abstract class AbstractUser {
	private Mediator mediator;

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	AbstractUser(Mediator mediator) {
		this.mediator = mediator;
	}

	abstract void work();
}
