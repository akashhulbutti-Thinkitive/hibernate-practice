package com.akash.utilities;

import java.util.ArrayList;
import java.util.List;

public class StoreUtil<T> {
	private List<T> list;

	public StoreUtil() {
		list = new ArrayList<T>();
	}

	public boolean addRecords(T t) {
		this.list.add(t);
		return true;
	}

	public List<T> getRecords() {
		return this.list;
	}

	public int getNumOfRecords() {
		return this.list.size();
	}
}
