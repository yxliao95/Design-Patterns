package com.ptn.creation._23interpreter;

public class Plus extends Expression {
	Expression leftExp;
	Expression rightExp;

	public Plus(Expression leftExp, Expression rightExp) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}

	@Override
	public int interpret(Context context) {
		return leftExp.interpret(context) + rightExp.interpret(context);
	}

}
