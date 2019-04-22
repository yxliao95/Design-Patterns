package com.ptn.creation._21visitor;

public class Test {
	public static void main(String[] args) {
		ObjectStructure os = new ObjectStructure();
		Element a = new ElementA();
		Element b = new ElementB();
		System.out.println(a);
		System.out.println(b);
		os.addElement(a);
		os.addElement(b);
		os.visitAllElement(new GoodVisitor());
		System.out.println(a);
		System.out.println(b);
		os.visitAllElement(new BadVisitor());
		System.out.println(a);
		System.out.println(b);
	}
}
