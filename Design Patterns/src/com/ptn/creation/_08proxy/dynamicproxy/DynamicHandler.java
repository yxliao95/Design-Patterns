package com.ptn.creation._08proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicHandler implements InvocationHandler {
	
	private Object obj;
	
	public DynamicHandler(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before");
		method.invoke(obj, args);
		System.out.println("after");
		return null;
	}
	
	public static void main(String[] args) {
		ConcreteClass concreteClass = new ConcreteClass();
		DynamicHandler handler = new DynamicHandler(concreteClass);
		Interface processer = (Interface) Proxy.newProxyInstance(concreteClass.getClass().getClassLoader(),
				concreteClass.getClass().getInterfaces(), handler);
		processer.dosth();
	}
}
