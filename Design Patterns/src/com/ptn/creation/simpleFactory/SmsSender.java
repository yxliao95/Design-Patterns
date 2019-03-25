package com.ptn.creation.simpleFactory;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("send a SMS");
	}

}
