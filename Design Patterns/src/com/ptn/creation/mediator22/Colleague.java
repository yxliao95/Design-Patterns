package com.ptn.creation.mediator22;

public abstract class Colleague {

	protected Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);

}
