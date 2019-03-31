package com.ptn.creation.builder4;

public class Test {
	public static void main(String[] args) {
		ConcreteBuilder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		Product product = director.construct();
		System.out.println(product);
	}
}
