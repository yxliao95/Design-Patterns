package com.ptn.creation._04builder;

/**
 * @Description: 使用Builder接口的对象。它主要是用于创建一个复杂的对象，它主要有两个作用，
 *               一是：隔离了客户与对象的生产过程；二是：负责控制产品对象的生产过程。
 * @author: liao
 * @date: 2019年3月31日 下午6:51:08
 */
public class Director {
	private AbstractBuilder builder;

	public Director(AbstractBuilder builder) {
		this.builder = builder;
	}

	public Product construct() {
		builder.buildName();
		builder.buildProperty();
		builder.buildValue();
		return builder.getProduct();
	}
}
