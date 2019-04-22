package com.ptn.creation._01factoryMethod.factory;

import com.ptn.creation._01factoryMethod.product.IProduct;
import com.ptn.creation._01factoryMethod.product.ProductB;

public class FactoryB implements IFactory {

	@Override
	public IProduct createProduct() {
		return new ProductB();
	}

}
