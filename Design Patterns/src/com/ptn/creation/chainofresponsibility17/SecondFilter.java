package com.ptn.creation.chainofresponsibility17;

public class SecondFilter implements Filter {

	@Override
	public void doFilter(Target target, FilterChain chain) {
		target.information = target.information + "/r/n decorated by SecondFilter";
		chain.doFilter(target);
	}

}
