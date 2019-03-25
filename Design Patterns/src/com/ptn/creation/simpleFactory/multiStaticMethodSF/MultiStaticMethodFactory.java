package com.ptn.creation.simpleFactory.multiStaticMethodSF;

import com.ptn.creation.simpleFactory.MailSender;
import com.ptn.creation.simpleFactory.SmsSender;

public class MultiStaticMethodFactory {

	public static MailSender createMailSender() {
		return new MailSender();
	}

	public static SmsSender createSmsSender() {
		return new SmsSender();
	}

	public static void main(String[] args) {
		MultiStaticMethodFactory.createMailSender().send();
		MultiStaticMethodFactory.createSmsSender().send();
	}

}
