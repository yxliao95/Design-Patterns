package com.ptn.creation.observation15;

public class ConcreteSubject extends ASubject {

	@Override
	public void add(IObserver observer) {
		obsList.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		obsList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		System.out.println("通知所有用户");
		for (IObserver iObserver : obsList) {
			iObserver.updata(this);
		}
	}

	public void operation(int state) {
		setState(state);
		System.out.println("状态发生改变");
		notifyObservers();
	}

}
