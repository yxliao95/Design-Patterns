package com.ptn.creation.singleton3;

public class StaticFieldSingleton {

	private static final StaticFieldSingleton singleton = new StaticFieldSingleton();

	private StaticFieldSingleton() {
	}

	public static StaticFieldSingleton getInstance() {
		return singleton;
	}
}
