package cn.design.behavior.command;

public class Receiver {
	public void doExecute(Command command) {
		if (command instanceof KillCommand) {
			KillCommand kc = (KillCommand) command;
			kc.getP().setLife(false);
			System.out.println("谋杀");
		} else if (command instanceof SaveCommand) {
			SaveCommand sc = (SaveCommand) command;
			sc.getP().setSafe(true);
			System.out.println("拯救");
		}
	}
}
