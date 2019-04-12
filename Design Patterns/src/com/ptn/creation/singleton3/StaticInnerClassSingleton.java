package com.ptn.creation.singleton3;

public class StaticInnerClassSingleton {

	private StaticInnerClassSingleton() {
		// TODO Auto-generated constructor stub
	}

	private static class InnerClass {
		private static final StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
	}

	public static StaticInnerClassSingleton getInstance() {
		return InnerClass.singleton;
	}
}
