package com.ptn.creation.simpleFactory.staticMethodSF;

import com.ptn.creation.simpleFactory.MailSender;
import com.ptn.creation.simpleFactory.SmsSender;

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
