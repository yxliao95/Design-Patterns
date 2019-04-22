package com.ptn.creation._18command;

public class Test {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(command);

		invoker.giveCommand();
	}
}
