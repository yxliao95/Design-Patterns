package com.ptn.creation.flyweight;

public class WhiteChess extends Chess {

	public WhiteChess() {
		super("白棋");
	}

	@Override
	public void putDown(Position position) {
		setPosition(position);
		System.out.println(getColor() + "落子，" + position);
	}

}
