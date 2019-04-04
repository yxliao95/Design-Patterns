package com.ptn.creation.Adapter6;

public class ClassAdapter extends Sort implements SortInterface {

	@Override
	public void sort() {
		System.out.println("通过类适配器调用：");
		binaryTreeSort();
	}

}
