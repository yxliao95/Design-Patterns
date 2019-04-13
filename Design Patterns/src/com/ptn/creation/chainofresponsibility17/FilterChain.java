package com.ptn.creation.chainofresponsibility17;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

	List<Filter> filterList = new ArrayList<>();
	int index = 0;

	public void addFilter(Filter filter) {
		filterList.add(filter);
	}

	public Filter getNextFilter() {
		return filterList.get(index++);
	}

	public void doFilter(Target target) {
		if (index == filterList.size()) {
			return;
		}
		Filter f = getNextFilter();
		f.doFilter(target, this);
		
	}

}
