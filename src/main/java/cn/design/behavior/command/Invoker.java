package cn.design.behavior.command;

public class Invoker {

	public void invoke(Command command) {
		command.exe();
	}
}
