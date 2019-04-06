package com.ptn.creation.Decorator7;


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
