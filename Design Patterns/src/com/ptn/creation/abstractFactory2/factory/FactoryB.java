package com.ptn.creation.abstractFactory2.factory;

import com.ptn.creation.abstractFactory2.product.IProductA;
import com.ptn.creation.abstractFactory2.product.IProductB;
import com.ptn.creation.abstractFactory2.product.ProductA2;
import com.ptn.creation.abstractFactory2.product.ProductB2;

public class FactoryB extends SuperiorFactory {

	@Override
	public IProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	public IProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
