package com.ptn.creation._11composit;

public class Test {

	public static void main(String[] args) {
		Node root = new Node("a", new Node("b"), new Node("c"));
		Node b = root.getLeftNode();
		b.setLeftNode(new Node("d"));
		b.setRightNode(new Node("e"));
		Node d = b.getLeftNode();
		d.setLeftNode(new Node("g"));
		d.setRightNode(new Node("h"));
		Node c = root.getRightNode();
		c.setLeftNode(new Node("k"));
		c.setRightNode(new Node("f"));
		Node f = c.getRightNode();
		f.setLeftNode(new Node("i", null, new Node("j")));
		
		root.print();

	}

}
