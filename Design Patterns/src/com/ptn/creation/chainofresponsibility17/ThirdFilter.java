package com.ptn.creation.chainofresponsibility17;

public class ThirdFilter implements Filter {

	@Override
	public void doFilter(Target target, FilterChain chain) {
		target.information = target.information+"/r/n decoration from ThirdFilter";
		chain.doFilter(target);
	}

}
