package com.ptn.creation.simpleFactory;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("send an e-mail");
	}

}
