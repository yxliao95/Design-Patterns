package com.ptn.creation.memento19;

public class CareTaker {
	private RoleMemento memento;

	public CareTaker(RoleMemento memento) {
		// TODO Auto-generated constructor stub
		this.memento = memento;
	}

	public RoleMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleMemento memento) {
		this.memento = memento;
	}

}
