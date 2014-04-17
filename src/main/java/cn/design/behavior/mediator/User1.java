package cn.design.behavior.mediator;

public class User1 extends AbstractUser {
	User1(Mediator mediator) {
		super(mediator);
	}

	@Override
	void work() {
		System.out.println(User1.class + " start to work!");
	}

}
