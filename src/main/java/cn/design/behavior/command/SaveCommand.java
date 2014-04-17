package cn.design.behavior.command;

public class SaveCommand implements Command {
	private Person p;
	private Receiver receiver;

	public Person getP() {
		return p;
	}

	public SaveCommand(Person p, Receiver receiver) {
		this.p = p;
		this.receiver = receiver;
	}

	@Override
	public void exe() {
		receiver.doExecute(this);
	}

}
