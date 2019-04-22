package com.ptn.creation._10bridge.abstraction;

import com.ptn.creation._10bridge.implementor.Color;

public abstract class Shape {
	protected Color color;

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void draw();
}
