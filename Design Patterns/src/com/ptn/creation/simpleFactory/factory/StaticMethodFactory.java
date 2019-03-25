package com.ptn.creation.simpleFactory.factory;

import com.ptn.creation.simpleFactory.product.MailSender;
import com.ptn.creation.simpleFactory.product.SmsSender;

public class StaticMethodFactory {

	public static MailSender createMailSender() {
		return new MailSender();
	}

	public static SmsSender createSmsSender() {
		return new SmsSender();
	}

	public static void main(String[] args) {
		StaticMethodFactory.createMailSender().send();
		StaticMethodFactory.createSmsSender().send();
	}

}
