package com.ptn.creation.bridge10.implementor;

public class White implements Color {

	@Override
	public void fill(String shape) {
		System.out.println("白色的" + shape);
	}

}
