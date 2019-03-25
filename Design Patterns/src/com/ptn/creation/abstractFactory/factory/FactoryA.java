package com.ptn.creation.abstractFactory.factory;

import com.ptn.creation.abstractFactory.product.IProductA;
import com.ptn.creation.abstractFactory.product.IProductB;
import com.ptn.creation.abstractFactory.product.ProductA1;
import com.ptn.creation.abstractFactory.product.ProductB1;

public class FactoryA extends SuperiorFactory {

	@Override
	public IProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public IProductB createProductB() {
		return new ProductB1();
	}

}
