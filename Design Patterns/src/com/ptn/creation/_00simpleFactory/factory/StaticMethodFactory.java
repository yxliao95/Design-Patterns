package com.ptn.creation._00simpleFactory.factory;

import com.ptn.creation._00simpleFactory.product.MailSender;
import com.ptn.creation._00simpleFactory.product.SmsSender;

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
