package com.ptn.creation.Adapter6;

class ObjectAdapter implements SortInterface {

	private Sort obj;
	
	public ObjectAdapter() {
		obj = new Sort();
	}
	
	@Override
	public void sort() {
		System.out.println("通过对象适配器调用：");
		obj.binaryTreeSort();
	}

}
