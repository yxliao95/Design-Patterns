package com.ptn.creation.flyweight;

public class BlackChess extends Chess {

	public BlackChess() {
		super("黑棋");
	}

	@Override
	public void putDown(Position position) {
		setPosition(position);
		System.out.println(getColor() + "落子，" + position);
	}

}
