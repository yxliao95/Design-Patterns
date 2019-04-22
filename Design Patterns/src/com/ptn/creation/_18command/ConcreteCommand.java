package com.ptn.creation._18command;

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
