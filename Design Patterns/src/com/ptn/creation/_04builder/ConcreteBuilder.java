package com.ptn.creation._04builder;

public class ConcreteBuilder extends AbstractBuilder {

	@Override
	public void buildName() {
		product.setName("产品A");
	}

	@Override
	public void buildProperty() {
		product.setProverty("属性x");
	}

	@Override
	public void buildValue() {
		product.setValue(1);
	}

}
