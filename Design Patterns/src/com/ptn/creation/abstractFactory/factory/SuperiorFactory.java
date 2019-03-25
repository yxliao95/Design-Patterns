package com.ptn.creation.abstractFactory.factory;

import com.ptn.creation.abstractFactory.product.IProductA;
import com.ptn.creation.abstractFactory.product.IProductB;

public abstract class SuperiorFactory {
	public abstract IProductA createProductA();

	public abstract IProductB createProductB();
}
