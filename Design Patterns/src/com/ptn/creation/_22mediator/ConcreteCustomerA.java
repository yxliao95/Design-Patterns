package com.ptn.creation._22mediator;

public class ConcreteCustomerA extends Customer {

	@Override
	public void send(String msg) {
		System.out.println(this.getClass().getSimpleName()+"发送信息: " + msg);
		mediator.contact(msg,this);
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.getClass().getSimpleName()+"收到信息: " + msg);
	}

}
