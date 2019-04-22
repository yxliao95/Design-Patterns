package com.ptn.creation._06adapter;

public class BubbleSort implements SortInterface {

	@Override
	public void sort() {
		System.out.println("由接口实现类提供冒泡排序");
	}

}
