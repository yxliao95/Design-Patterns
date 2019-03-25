package com.ptn.creation.simpleFactory.factory;

import com.ptn.creation.simpleFactory.product.MailSender;
import com.ptn.creation.simpleFactory.product.SmsSender;

public class MultiMethodFactory {
	public MailSender createMailSender() {
		return new MailSender();
	}

	public SmsSender createSmsSender() {
		return new SmsSender();
	}

	public static void main(String[] args) {
		MultiMethodFactory mFactory = new MultiMethodFactory();
		mFactory.createMailSender().send();
		mFactory.createSmsSender().send();
	}
}
