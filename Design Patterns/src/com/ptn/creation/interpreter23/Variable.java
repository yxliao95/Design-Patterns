package com.ptn.creation.interpreter23;

public class Variable extends Expression {

	private String key;

	public Variable(String key) {
		this.key = key;
	}

	@Override
	public int interpret(Context context) {
		return context.convert(key);
	}

}
