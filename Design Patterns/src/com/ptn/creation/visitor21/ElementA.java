package com.ptn.creation.visitor21;

public class ElementA implements Element {

	private String name = "element A";

	private int money = 10;

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
		visitor.visitElementA(this);
	}

	@Override
	public String toString() {
		return "ElementA [name=" + name + ", money=" + money + "]";
	}
	

}
