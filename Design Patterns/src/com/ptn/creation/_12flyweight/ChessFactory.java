package com.ptn.creation._12flyweight;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ChessFactory {

	public static int WHITECHESS = 0;
	public static int BLACKCHESS = 1;

	private Set<Chess> chessSet = new HashSet<>();

	public Chess getChess(int chessType) {
		if (chessType == WHITECHESS) {
			Optional<Chess> whiteChess = chessSet.stream().filter(e -> e.getColor() == "白棋").findAny();
			return whiteChess.orElseGet(() -> {
				var chess = new WhiteChess();
				chessSet.add(chess);
				return chess;
			});
		} else {
			Optional<Chess> blackChess = chessSet.stream().filter(e -> e.getColor() == "黑棋").findAny();
			return blackChess.orElseGet(() -> {
				var chess = new BlackChess();
				chessSet.add(chess);
				return chess;
			});
		}
	}

	public int getCount() {
		return chessSet.size();
	}

}
