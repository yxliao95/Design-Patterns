package com.ptn.creation._02abstractFactory.factory;

import com.ptn.creation._02abstractFactory.product.IProductA;
import com.ptn.creation._02abstractFactory.product.IProductB;

public abstract class SuperiorFactory {
	public abstract IProductA createProductA();

	public abstract IProductB createProductB();
}
