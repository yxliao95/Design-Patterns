package com.ptn.creation._01factoryMethod.factory;

import com.ptn.creation._01factoryMethod.product.IProduct;
import com.ptn.creation._01factoryMethod.product.ProductA;

public class FactoryA implements IFactory {

	@Override
	public IProduct createProduct() {
		return new ProductA();
	}

}
