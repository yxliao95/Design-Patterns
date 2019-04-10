package com.ptn.creation.composit11;

public class Node {
	private String name;
	private Node leftNode;
	private Node rightNode;

	public Node(String name) {
		this.name = name;
	}

	public Node(String name, Node leftNode, Node rightNode) {
		this(name);
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public void print() {
		System.out.print(getName()+" ");
		if (hasLeftNode()) {
			leftNode.print();
		}
		if (hasRightNode()) {
			rightNode.print();
		}
	}

	public boolean hasRightNode() {
		return rightNode != null;
	}

	public boolean hasLeftNode() {
		return leftNode != null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

}
