package com.ptn.creation.singleton3;

public class StaticInnerClassSingleton {

	private static class InnerClass {
		static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
	}

	public StaticInnerClassSingleton getInstance() {
		return InnerClass.singleton;
	}
}
