package com.ptn.creation.interpreter23;

import java.util.HashMap;
import java.util.Map;

public class Context {

	Map<String, Integer> variableMap;

	public Context() {
		variableMap = new HashMap<>();
	}

	public void add(String key, Integer value) {
		variableMap.put(key, value);
	}

	public int convert(String key) {
		return variableMap.get(key);
	}

}
