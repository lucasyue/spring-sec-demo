package cn.design.behavior.mediator;

public class TheMediator implements Mediator {
	public AbstractUser user1;
	public AbstractUser user2;

	public Mediator createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
		return this;
	}

	@Override
	public void workAll() {
		user1.work();
		user2.work();
	}

}
