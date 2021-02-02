package com.akash.utilities;

import java.util.Collections;
import java.util.List;

import com.akash.comparable_classes.CompareByName;
import com.akash.comparable_classes.CompareByPrice;
import com.akash.models.Book;

public class SortUtil {
	public SortUtil() {
	
	}
	public static List sortByName(List<Book> list){
		Collections.sort(list, new CompareByName());			
		return list;
	}
	
	public static List sortByPrice(List<Book> list){
		Collections.sort(list, new CompareByPrice());
		return list;
	}
}
