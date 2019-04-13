package com.ptn.creation.chainofresponsibility17;

public interface Filter {
	public void doFilter(Target target, FilterChain chain);
}
