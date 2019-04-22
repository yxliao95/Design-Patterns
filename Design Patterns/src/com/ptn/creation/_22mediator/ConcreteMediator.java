package com.ptn.creation._22mediator;

import java.util.List;

public class ConcreteMediator implements Mediator {

	private ConcreteColleagueA colleagueA;
	private ConcreteColleagueB colleagueB;

	public ConcreteColleagueA getColleagueA() {
		return colleagueA;
	}

	public void setColleagueA(ConcreteColleagueA colleagueA) {
		this.colleagueA = colleagueA;
	}

	public ConcreteColleagueB getColleagueB() {
		return colleagueB;
	}

	public void setColleagueB(ConcreteColleagueB colleagueB) {
		this.colleagueB = colleagueB;
	}

	@Override
	public void contact(String msg, Colleague colleague) {
		if (colleague instanceof ConcreteColleagueA) {
			colleagueB.receive(msg);
		} else {
			colleagueA.receive(msg);
		}
	}

}
