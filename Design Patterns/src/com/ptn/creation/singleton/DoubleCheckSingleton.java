package com.ptn.creation.singleton;

public class DoubleCheckSingleton {

	private volatile DoubleCheckSingleton singleton;

	private DoubleCheckSingleton() {
	}

	public DoubleCheckSingleton getInstance() {
		if (singleton == null) {
			synchronized (this) {
				if (singleton == null) {
					singleton = new DoubleCheckSingleton();
				}
			}
		}
		return singleton;
	}
}
