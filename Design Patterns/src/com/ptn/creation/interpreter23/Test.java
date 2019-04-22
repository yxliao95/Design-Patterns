package com.ptn.creation.interpreter23;

public class Test {

	public static void main(String[] args) {
		Context context = new Context();
		context.add("a", 1);
		context.add("b", 2);
		context.add("c", 3);
		context.add("d", 4);

		Variable a = new Variable("a");
		Variable b = new Variable("b");
		Variable c = new Variable("c");
		Variable d = new Variable("d");

		Expression expression = new Substraction(new Plus(new Plus(a, b), new Multiply(c, d)), a);
		System.out.println(expression.interpret(context));
	}
}
