package com.ptn.creation._03singleton;

public class StaticFieldSingleton {

	private static final StaticFieldSingleton singleton = new StaticFieldSingleton();

	private StaticFieldSingleton() {
	}

	public static StaticFieldSingleton getInstance() {
		return singleton;
	}
}
