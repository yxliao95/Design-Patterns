package com.ptn.creation.visitor21;

/**
 * @Description: 坏访问者，偷钱
 * @author: liao
 * @date: 2019年4月19日 下午3:47:04
 */
public class BadVisitor implements IVisitor {

	@Override
	public void visitElementA(ElementA element) {
		// TODO Auto-generated method stub
		element.setMoney(element.getMoney() - 10);
	}

	@Override
	public void visitElementB(ElementB element) {
		// TODO Auto-generated method stub
		element.setMoney(element.getMoney() - 10);
	}

}
