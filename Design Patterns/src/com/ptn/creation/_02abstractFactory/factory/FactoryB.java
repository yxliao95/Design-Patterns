package com.ptn.creation._02abstractFactory.factory;

import com.ptn.creation._02abstractFactory.product.IProductA;
import com.ptn.creation._02abstractFactory.product.IProductB;
import com.ptn.creation._02abstractFactory.product.ProductA2;
import com.ptn.creation._02abstractFactory.product.ProductB2;

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
