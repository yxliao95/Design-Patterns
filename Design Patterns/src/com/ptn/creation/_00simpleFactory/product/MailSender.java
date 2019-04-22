package com.ptn.creation._00simpleFactory.product;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("send an e-mail");
	}

}
