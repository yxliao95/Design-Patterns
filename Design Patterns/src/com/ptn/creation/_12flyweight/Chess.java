package com.ptn.creation._12flyweight;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description: abstract flyweight class
 * @author: liao
 * @date: 2019年4月10日 下午5:56:08
 */
public abstract class Chess {

	/**
	 * intristic
	 */
	private String color;

	/**
	 * extristic
	 */
	private Position position;

	public Chess(String color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}

	public abstract void putDown(Position position);

	public String getColor() {
		return color;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
