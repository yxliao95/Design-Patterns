package com.ptn.creation._15observation;

public class ConcreteObserverB implements IObserver {

	int state;

	@Override
	public void updata(IObservable observable) {
		state = observable.getState();
		System.out.println("用户B自动更新状态state为" + state);
	}

}
