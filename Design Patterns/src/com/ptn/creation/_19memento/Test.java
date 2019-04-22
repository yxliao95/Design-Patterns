package com.ptn.creation._19memento;

public class Test {

	public static void main(String[] args) {
		Role role = new Role(100, 10, 8);
		System.out.println("save point");
		CareTaker careTaker = new CareTaker(role.save());
		System.out.println(role);
		System.out.println("change role state");
		role.setVitality(89);
		System.out.println(role);
		System.out.println("restore role state");
		role.restore(careTaker.getMemento());
		System.out.println(role);
		
	}

}
