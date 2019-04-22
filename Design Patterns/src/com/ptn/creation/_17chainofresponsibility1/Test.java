package com.ptn.creation._17chainofresponsibility1;

public class Test {
	public static void main(String[] args) {
		FilterChain chain = new FilterChain();
		chain.addFilter(new FirstFilter());
		chain.addFilter(new SecondFilter());
		chain.addFilter(new ThirdFilter());
		Target target = new Target();
		System.out.println(target);
		chain.doFilter(target);
		System.out.println(target);
	}
}
