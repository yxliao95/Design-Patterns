package com.ptn.creation.state20;

public class Test {
	public static void main(String[] args) {
		Context context = new Context(Context.STATEA);
		context.firstStep();
		context.secondStep();
		context.firstStep();
		context.thirdStep();
	}
}
