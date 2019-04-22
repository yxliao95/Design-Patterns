package com.ptn.creation.visitor21;

public class ElementB implements Element {

	private String name = "element B";

	private int money = 20;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitElementB(this);
	}

	@Override
	public String toString() {
		return "ElementB [name=" + name + ", money=" + money + "]";
	}

}
