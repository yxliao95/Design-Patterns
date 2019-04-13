package com.ptn.creation.chainofresponsibility17;

public class FirstFilter implements Filter {

	@Override
	public void doFilter(Target target, FilterChain chain) {
		target.information = target.information + "/r/n decoration from FirstFilter";
		chain.doFilter(target);
	}

}
