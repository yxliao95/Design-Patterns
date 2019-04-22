package com.ptn.creation._00simpleFactory.factory;

import com.exception.SenderNotFoundException;
import com.ptn.creation._00simpleFactory.product.MailSender;
import com.ptn.creation._00simpleFactory.product.Sender;
import com.ptn.creation._00simpleFactory.product.SmsSender;

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
