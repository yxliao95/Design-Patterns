package com.ptn.creation.strategy13;

public class ConcreteAlgorithmA implements IAlgorithm{

	@Override
	public void operation(String string) {
		System.out.println("选择算法1，执行："+string);
	}

}
