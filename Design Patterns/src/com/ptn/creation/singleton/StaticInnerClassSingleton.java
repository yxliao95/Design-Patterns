package com.ptn.creation.singleton;

public class StaticInnerClassSingleton {

	private static class InnerClass {
		static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
	}

	public StaticInnerClassSingleton getInstance() {
		return InnerClass.singleton;
	}
}
