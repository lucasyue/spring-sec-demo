package cn.design.behavior.command.c;

public class Invoker {
	public void invoke(Command command) {
		command.exe();
	}
}
