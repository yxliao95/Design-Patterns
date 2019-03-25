package com.ptn.creation.abstractFactory;

import com.ptn.creation.abstractFactory.factory.FactoryA;
import com.ptn.creation.abstractFactory.factory.FactoryB;
import com.ptn.creation.abstractFactory.factory.SuperiorFactory;

public class TestUser {

	public void dosth(SuperiorFactory factory) {
		factory.createProductA().functionA();
		factory.createProductB().functionB();
	}

	public static void main(String[] args) {
		SuperiorFactory factory1 = new FactoryA();
		SuperiorFactory factory2 = new FactoryB();
		TestUser user = new TestUser();
		user.dosth(factory1);
		user.dosth(factory2);
	}
}
