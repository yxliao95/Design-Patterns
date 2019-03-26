package com.ptn.creation.singleton;

public class StaticInnerClassSingleton {

	private StaticInnerClassSingleton singleton;

	private static class InnerClass {
		static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
	}

	public StaticInnerClassSingleton getInstance() {
		if (singleton == null) {
			singleton = InnerClass.singleton;
		}
		return singleton;
	}
}
