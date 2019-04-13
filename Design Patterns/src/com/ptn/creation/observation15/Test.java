package com.ptn.creation.observation15;

public class Test {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		subject.add(new ConcreteObserverA());
		subject.add(new ConcreteObserverB());
		subject.operation(1);

		subject.operation(2);
	}
}
