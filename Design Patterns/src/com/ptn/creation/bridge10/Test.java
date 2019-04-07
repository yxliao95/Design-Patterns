package com.ptn.creation.bridge10;

import com.ptn.creation.bridge10.abstraction.Circle;
import com.ptn.creation.bridge10.abstraction.Shape;
import com.ptn.creation.bridge10.implementor.Black;
import com.ptn.creation.bridge10.implementor.White;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle();
		circle.setColor(new Black());
		circle.draw();
		circle.setColor(new White());
		circle.draw();
	}

}
