package com.akash.comparable_classes;

import java.util.Comparator;

import com.akash.models.Book;

public class CompareByPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getBookPrice() == o2.getBookPrice())
			return 0;
		else if (o1.getBookPrice() > o2.getBookPrice())
			return 1;
		else
			return -1;
	}

}
