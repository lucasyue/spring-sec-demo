package cn.design.behavior.command;

public class KillCommand implements Command {
	private Receiver receiver;
	private Person p;

	public Person getP() {
		return p;
	}

	public KillCommand(Person p, Receiver receiver) {
		this.p = p;
		this.receiver = receiver;

	}

	@Override
	public void exe() {
		receiver.doExecute(this);
	}

}
