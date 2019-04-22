package com.ptn.creation._01factoryMethod;

import com.ptn.creation._01factoryMethod.factory.FactoryA;
import com.ptn.creation._01factoryMethod.factory.IFactory;
import com.ptn.creation._01factoryMethod.product.IProduct;

/**   
 * @Description: 与简单工厂模式相比，工厂方法模式的好处在于，如果出现新的产品，不需要修改工厂类，而是通过继承工厂接口实现一个新的工厂类
 * @author: 	 liao
 * @date:   	 2019年3月25日 下午5:04:37   
 */  
public class TestUser {
	
	public void dosth(IFactory factory) {
		IProduct product = factory.createProduct();
		product.used();
	}

	public static void main(String[] args) {
		TestUser user = new TestUser();
		user.dosth(new FactoryA());
	}

}
