package com.ptn.creation._16iterator;

public interface ICollection<T> {
	public void add(T e);

	public T get(int i);

	public boolean remove(int i);

	public IIterator<T> iterator();
	
	public int size();
}
