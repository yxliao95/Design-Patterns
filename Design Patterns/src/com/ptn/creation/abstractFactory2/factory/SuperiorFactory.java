package com.ptn.creation.abstractFactory2.factory;

import com.ptn.creation.abstractFactory2.product.IProductA;
import com.ptn.creation.abstractFactory2.product.IProductB;

public abstract class SuperiorFactory {
	public abstract IProductA createProductA();

	public abstract IProductB createProductB();
}
