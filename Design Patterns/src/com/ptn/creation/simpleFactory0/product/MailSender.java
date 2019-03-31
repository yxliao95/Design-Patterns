package com.ptn.creation.simpleFactory0.product;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("send an e-mail");
	}

}
