package com.ptn.creation._21visitor;

/**
 * @Description: 善良的访问者，送钱
 * @author: liao
 * @date: 2019年4月19日 下午3:42:18
 */
public class GoodVisitor implements IVisitor {

	@Override
	public void visitElementA(ElementA element) {
		element.setMoney(element.getMoney() + 5);
	}

	@Override
	public void visitElementB(ElementB element) {
		// TODO Auto-generated method stub
		element.setMoney(element.getMoney() + 20);
	}

}
