package com.ptn.creation.abstractFactory.factory;

import com.ptn.creation.abstractFactory.product.IProductA;
import com.ptn.creation.abstractFactory.product.IProductB;
import com.ptn.creation.abstractFactory.product.ProductA2;
import com.ptn.creation.abstractFactory.product.ProductB2;

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
