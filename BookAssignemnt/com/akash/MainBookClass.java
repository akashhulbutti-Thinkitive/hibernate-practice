package com.akash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.akash.models.Book;
import com.akash.utilities.PrintUtil;
import com.akash.utilities.SortUtil;
import com.akash.utilities.StoreUtil;

public class MainBookClass {
	
	public MainBookClass() {

	}

	public static void main(String[] args) {

		Set<String> authSet1 = new HashSet<String>();
		Set<String> authSet2 = new HashSet<String>();
		Set<String> authSet3 = new HashSet<String>();
		authSet1.add("Y Kanetkar"); authSet1.add("L Gibson"); authSet1.add("N.R Kemkar");
		authSet2.add("M.K Lisbon"); authSet2.add("G.H Willson");
		authSet3.add("M.K Lisbon"); authSet3.add("L Gibson"); authSet3.add("H D Mao");
		Book bk1= new Book(1,"C",authSet1,7999);
		Book bk2= new Book(2,"Python",authSet2,1099);
		Book bk3= new Book(3,"JavaScript",authSet3,1199);	
		
		StoreUtil<Book> su =new StoreUtil<Book>();

		su.addRecords(bk1);
		su.addRecords(bk2);
		su.addRecords(bk3);
		System.out.println("3 books Added");		
		System.out.println("\n\nNo Of Book Records : "+su.getNumOfRecords());
		System.out.println("\n\nList Of Books : "+su.getRecords());
		PrintUtil pu =new PrintUtil();
		System.out.println("\n\nPrint All Books : ");
		pu.printRecords(su.getRecords());
		
		SortUtil sortU = new SortUtil();
		sortU.sortByName(su.getRecords());
		System.out.println("\n\nSort By Name :");
		pu.printRecords(su.getRecords());
		

		sortU.sortByPrice(su.getRecords());
		System.out.println("\n\nSort By Price :");
		pu.printRecords(su.getRecords());
		
	
	}

}
