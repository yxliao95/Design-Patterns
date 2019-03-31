package com.ptn.creation.simpleFactory0.product;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("send a SMS");
	}

}
