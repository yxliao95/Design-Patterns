package com.ptn.creation._07decorator;


public class BlackWindow implements IWindow {
	private Window window;
	
	public BlackWindow() {
		// TODO Auto-generated constructor stub
		window = new Window();
	}

	@Override
	public void installWindow() {
		window.installWindow();
		System.out.println("贴黑色膜");
	}

}
