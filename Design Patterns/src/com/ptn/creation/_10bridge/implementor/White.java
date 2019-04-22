package com.ptn.creation._10bridge.implementor;

public class White implements Color {

	@Override
	public void fill(String shape) {
		System.out.println("白色的" + shape);
	}

}
