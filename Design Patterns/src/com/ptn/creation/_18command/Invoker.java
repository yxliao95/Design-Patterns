package com.ptn.creation._18command;

public class Invoker {
	private Command command;

	public Invoker(Command command) {
		// TODO Auto-generated constructor stub
		this.command = command;
	}

	public void giveCommand() {
		command.execute();
	}

}
