package com.akash.crud;

import java.net.ConnectException;
import java.util.Scanner;
import com.akash.crud.Employee;

public class MyMainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("********* Menu *********");
			System.out.println("\t 1 : Add Employee");
			System.out.println("\t 2 : View Employee");
			System.out.println("\t 3 : Update Employee");
			System.out.println("\t 4 : Delete Employee");
			System.out.println("\t 5 : Exit");
			System.out.print("\n Enter Your Choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				new MyConnectionClass().saveEmployee(new Employee(1234,"JOJO",90000));
				System.out.println("Employee Saved");
				break;
			case 2:
				new MyConnectionClass().showListEmployee();
				break;
			case 3:
				new MyConnectionClass().updateEmployee(new Employee(1234,"Updated JoJO",90000));;
				System.out.println("Update");
				break;
			case 4:
				new MyConnectionClass().deleteEmployee(1234);
				System.out.println("Eployee Deleted");
				break;
			}
		} while (choice != 5);
	}

}
