package com.ptn.creation._22mediator;

public abstract class Customer {

	protected Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);

}
