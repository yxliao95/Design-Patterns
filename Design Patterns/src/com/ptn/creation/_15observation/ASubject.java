package com.ptn.creation._15observation;

import java.util.ArrayList;
import java.util.List;

public abstract class ASubject implements IObservable {

	protected List<IObserver> obsList = new ArrayList<>();
	protected int state;

	public abstract void add(IObserver observer);

	public abstract void remove(IObserver observer);

	public abstract void notifyObservers();

	public int getState() {
		return state;
	}

	protected void setState(int i) {
		state = i;
	}

}
