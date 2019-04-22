package com.ptn.creation._22mediator;

public class Test {
	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		ConcreteColleagueA a = new ConcreteColleagueA();
		ConcreteColleagueB b = new ConcreteColleagueB();
		a.setMediator(mediator);
		b.setMediator(mediator);
		mediator.setColleagueA(a);
		mediator.setColleagueB(b);
		
		a.send("我要租房子");
		b.send("这里有个房子待租");
	}
}
