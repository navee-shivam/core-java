package com.corejava.collectionFW.ListCreation;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class NaveenList<E> implements NaveenListInterface<E> {

	private static final Object[] DEFAULT_CAPACITY = {};

	private Object[] dataValue;

	private int size = 0;

	public NaveenList() {
		this.dataValue = DEFAULT_CAPACITY;
	}

	@Override
	public Boolean add(E e) {
		if (size == this.dataValue.length)
			this.dataValue = grow();
		this.dataValue[size] = e;
		size++;
		return true;
	}

	@Override
	public E findByIndex(int index) throws NoSuchElementException {
		if (size < index)
			throw new NoSuchElementException("Dummal Dummel");
		return (E) this.dataValue[index];
	}

	@Override
	public Boolean removeElement(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean removeAll() {
		this.dataValue = DEFAULT_CAPACITY;
		size = 0;
		return true;
	}

	@Override
	public int sizeOfList() {
		return size;
	}

	private Object[] grow() {
		int capacity = this.dataValue.length + 1;
		return this.dataValue = Arrays.copyOf(this.dataValue, capacity);
	}

	@Override
	public String toString() {
		return "NaveenList [dataValue=" + Arrays.toString(this.dataValue) + "]";
	}
}
