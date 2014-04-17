package cn.design.behavior.mediator;

public class User2 extends AbstractUser {

	User2(Mediator mediator) {
		super(mediator);
	}

	@Override
	void work() {
		System.out.println(User2.class + " start to work!");
	}

}
