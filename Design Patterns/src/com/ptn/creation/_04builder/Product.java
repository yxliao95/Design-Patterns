package com.ptn.creation._04builder;

public class Product {

	private String name;
	private String proverty;
	private int value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProverty() {
		return proverty;
	}

	public void setProverty(String proverty) {
		this.proverty = proverty;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", proverty=" + proverty + ", value=" + value + "]";
	}

}
