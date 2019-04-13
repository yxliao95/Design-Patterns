package com.ptn.creation.iterator16;

public class Test {
	public static void main(String[] args) {
		MyCollection collection = new MyCollection();
		collection.add("1.haha");
		collection.add("2.asd");
		collection.add("3.dfg");
		System.out.println(collection);
		System.out.println(collection.size());
		IIterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(collection.remove(1));
		System.out.println(collection);
		IIterator iterator2 = collection.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
