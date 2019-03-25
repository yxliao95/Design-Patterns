package com.ptn.creation.factoryMethod.factory;

import com.ptn.creation.factoryMethod.product.IProduct;
import com.ptn.creation.factoryMethod.product.ProductB;

public class FactoryB implements IFactory {

	@Override
	public IProduct createProduct() {
		return new ProductB();
	}

}
