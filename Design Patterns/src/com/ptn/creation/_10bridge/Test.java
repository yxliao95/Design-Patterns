package com.ptn.creation._10bridge;

import com.ptn.creation._10bridge.abstraction.Circle;
import com.ptn.creation._10bridge.abstraction.Shape;
import com.ptn.creation._10bridge.implementor.Black;
import com.ptn.creation._10bridge.implementor.White;

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
