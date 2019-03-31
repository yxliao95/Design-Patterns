package com.ptn.creation.factoryMethod1.factory;

import com.ptn.creation.factoryMethod1.product.IProduct;
import com.ptn.creation.factoryMethod1.product.ProductA;

public class FactoryA implements IFactory {

	@Override
	public IProduct createProduct() {
		return new ProductA();
	}

}
