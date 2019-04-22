package com.ptn.creation._00simpleFactory.factory;

import com.ptn.creation._00simpleFactory.product.MailSender;
import com.ptn.creation._00simpleFactory.product.SmsSender;

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
