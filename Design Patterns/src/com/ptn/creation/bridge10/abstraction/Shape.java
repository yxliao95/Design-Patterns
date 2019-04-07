package com.ptn.creation.bridge10.abstraction;

import com.ptn.creation.bridge10.implementor.Color;

public abstract class Shape {
	protected Color color;

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void draw();
}
