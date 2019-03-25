package com.ptn.creation.factoryMethod.factory;

import com.ptn.creation.factoryMethod.product.IProduct;
import com.ptn.creation.factoryMethod.product.ProductA;

public class FactoryA implements IFactory {

	@Override
	public IProduct createProduct() {
		return new ProductA();
	}

}
