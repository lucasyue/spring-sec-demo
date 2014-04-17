package cn.design.behavior.command.c;

public class MyCommand implements Command {
	Receiver receiver;

	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void exe() {
		receiver.action();
	}

}
