package com.ptn.creation._15observation;

public interface IObservable {

	public void add(IObserver observer);

	public void remove(IObserver observer);

	public void notifyObservers();

	public int getState();
}
