package com.ptn.creation.observation15;

public interface IObservable {

	public void add(IObserver observer);

	public void remove(IObserver observer);

	public void notifyObservers();

	public int getState();
}
