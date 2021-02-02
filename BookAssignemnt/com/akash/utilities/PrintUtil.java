package com.akash.utilities;

import java.util.List;

import com.akash.models.Book;

public class PrintUtil {
	public static void printRecords(List<Book> list) {
		if (list.size() > 0) {
			for (Book book : list) {
				System.out.println("ID : " + book.getBookId() + " Book Name :" + book.getBookName() + " Authors : "
						+ book.getAuthors() + " Price : " + book.getBookPrice());
			}
		} else {
			System.out.println("No Books To Display");
		}

	}

}
