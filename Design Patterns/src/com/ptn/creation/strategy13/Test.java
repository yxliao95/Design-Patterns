package com.ptn.creation.strategy13;

public class Test {
	public static void main(String[] args) {
		IAlgorithm obj = new ConcreteAlgorithmA();
		obj.operation("gogogo");
		obj.operation("run away");

		IAlgorithm obj2 = new ConcreteAlgorithmB();
		obj2.operation("run away");
	}
}
