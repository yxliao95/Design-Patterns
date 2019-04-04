package com.ptn.creation.Adapter6;

public class Test {
	public static void main(String[] args) {
		SortInterface operator = new BubbleSort();
		System.out.println("通过接口操作：");
		operator.sort();

		// 不通过适配器，就无法通过接口进行操作，可能导致需要对程序多处代码进行修改
//		SortInterface operator3 = new Sort();

		// 类适配器
		System.out.println("通过接口操作：");
		SortInterface operator1 = new ClassAdapter();
		operator1.sort();

		// 对象适配器
		System.out.println("通过接口操作：");
		SortInterface operator2 = new ObjectAdapter();
		operator2.sort();
	}
}
