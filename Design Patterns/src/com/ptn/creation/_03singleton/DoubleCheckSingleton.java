package com.ptn.creation._03singleton;

public class DoubleCheckSingleton {

	private static volatile DoubleCheckSingleton singleton;

	private DoubleCheckSingleton() {
	}

	public static DoubleCheckSingleton getInstance() {
		if (singleton == null) {
			synchronized (singleton) {
				if (singleton == null) {
					singleton = new DoubleCheckSingleton();
				}
			}
		}
		return singleton;
	}
}
