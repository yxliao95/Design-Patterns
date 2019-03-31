package com.ptn.creation.abstractFactory2.factory;

import com.ptn.creation.abstractFactory2.product.IProductA;
import com.ptn.creation.abstractFactory2.product.IProductB;
import com.ptn.creation.abstractFactory2.product.ProductA1;
import com.ptn.creation.abstractFactory2.product.ProductB1;

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
