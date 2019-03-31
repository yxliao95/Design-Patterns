package com.ptn.creation.singleton3;

public class StaticFieldSingleton {

	private static StaticFieldSingleton singleton = new StaticFieldSingleton();

	private StaticFieldSingleton() {
	}

	public StaticFieldSingleton getInstance() {
		return singleton;
	}
}
