package com.ptn.creation.facade9;

public class Facade {

	private SubSystemA subSystemA = new SubSystemA();
	private SubSystemB subSystemB = new SubSystemB();
	private SubSystemC subSystemC = new SubSystemC();
	
	public void startup() {
		subSystemA.startup();
		subSystemB.startup();
		subSystemC.startup();
	}
	public void shutdown() {
		subSystemA.shutdown();
		subSystemB.shutdown();
		subSystemC.shutdown();
	}
}
