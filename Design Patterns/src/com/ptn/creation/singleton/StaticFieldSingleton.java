package com.ptn.creation.singleton;

public class StaticFieldSingleton {

	private static StaticFieldSingleton singleton = new StaticFieldSingleton();

	private StaticFieldSingleton() {
	}

	public StaticFieldSingleton getInstance() {
		return singleton;
	}
}
