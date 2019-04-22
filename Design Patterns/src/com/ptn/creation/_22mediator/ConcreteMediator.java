package com.ptn.creation._22mediator;

public class ConcreteMediator implements Mediator {

	private ConcreteCustomerA colleagueA;
	private ConcreteCustomerB colleagueB;

	public ConcreteCustomerA getColleagueA() {
		return colleagueA;
	}

	public void setColleagueA(ConcreteCustomerA colleagueA) {
		this.colleagueA = colleagueA;
	}

	public ConcreteCustomerB getColleagueB() {
		return colleagueB;
	}

	public void setColleagueB(ConcreteCustomerB colleagueB) {
		this.colleagueB = colleagueB;
	}

	@Override
	public void contact(String msg, Customer colleague) {
		if (colleague instanceof ConcreteCustomerA) {
			colleagueB.receive(msg);
		} else {
			colleagueA.receive(msg);
		}
	}

}
