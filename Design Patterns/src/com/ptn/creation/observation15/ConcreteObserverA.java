package com.ptn.creation.observation15;

public class ConcreteObserverA implements IObserver {

	int state;

	@Override
	public void updata(IObservable observable) {
		state = observable.getState();
		System.out.println("用户A自动更新状态state为" + state);
	}

}
