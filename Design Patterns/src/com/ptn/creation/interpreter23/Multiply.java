package com.ptn.creation.interpreter23;

public class Multiply extends Expression {
	Expression leftExp;
	Expression rightExp;

	public Multiply(Expression leftExp, Expression rightExp) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}

	@Override
	public int interpret(Context context) {
		return leftExp.interpret(context) * rightExp.interpret(context);
	}

}
