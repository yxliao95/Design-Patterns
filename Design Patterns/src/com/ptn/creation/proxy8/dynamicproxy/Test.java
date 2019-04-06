package com.ptn.creation.proxy8.dynamicproxy;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		ConcreteClass concreteClass = new ConcreteClass();
		DynamicHandler handler = new DynamicHandler(concreteClass);
		Interface processer = (Interface) Proxy.newProxyInstance(concreteClass.getClass().getClassLoader(),
				concreteClass.getClass().getInterfaces(), handler);
		processer.dosth();
		System.out.println(processer.getClass());
	}

}
