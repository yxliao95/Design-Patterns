package com.ptn.creation.builder4;

/**   
 * @Description: 创建一个Product对象的各个部件指定的抽象接口。
 * @author: 	 liao
 * @date:   	 2019年3月31日 下午6:54:06   
 */  
public abstract class AbstractBuilder {

	Product product = new Product();

	public abstract void buildName();

	public abstract void buildProperty();

	public abstract void buildValue();

	public Product getProduct() {
		return product;
	}
}
