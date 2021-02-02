package com.akash.comparable_classes;

import java.util.Comparator;

import com.akash.models.Book;

public class CompareByName implements Comparator<Book>{
	
	public CompareByName() {
	}

	@Override
	public int compare(Book o1, Book o2) {
			return o1.getBookName().compareTo(o2.getBookName());
	}

}
