package com.ptn.creation._12flyweight;

public class TestClient {

	public static void main(String[] args) {
		ChessFactory factory = new ChessFactory();
		Chess chess = factory.getChess(ChessFactory.WHITECHESS);
		chess.putDown(new Position(8, 8));

		Chess c2 = factory.getChess(ChessFactory.BLACKCHESS);
		c2.putDown(new Position(8, 7));

		Chess c3 = factory.getChess(0);
		c3.putDown(new Position(3, 3));

		Chess c4 = factory.getChess(1);
		c4.putDown(new Position(3, 5));

		System.out.println(factory.getCount());
	}

}
