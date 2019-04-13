package com.ptn.creation.command18;

public class ConcreteCommand implements Command {

	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
