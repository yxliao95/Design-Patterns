package com.ptn.creation.simpleFactory0.factory;

import com.exception.SenderNotFoundException;
import com.ptn.creation.simpleFactory0.product.MailSender;
import com.ptn.creation.simpleFactory0.product.Sender;
import com.ptn.creation.simpleFactory0.product.SmsSender;

public class SenderFactory {

	public Sender createSender(String senderName) throws SenderNotFoundException {
		if ("sms".equals(senderName.toLowerCase())) {
			return new SmsSender();
		} else if ("mail".equals(senderName.toLowerCase())) {
			return new MailSender();
		} else {
			throw new SenderNotFoundException();
		}
	}

	public static void main(String[] args) {
		SenderFactory senderFactory = new SenderFactory();
		Sender sender;
		try {
			sender = senderFactory.createSender("Sms");
			sender.send();
		} catch (SenderNotFoundException e) {
			e.printStackTrace();
		}
	}
}
