package com.ptn.creation._02abstractFactory.factory;

import com.ptn.creation._02abstractFactory.product.IProductA;
import com.ptn.creation._02abstractFactory.product.IProductB;
import com.ptn.creation._02abstractFactory.product.ProductA1;
import com.ptn.creation._02abstractFactory.product.ProductB1;

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
