
package com.capgemini.lab5.exercise4;
import java.util.*;
public class Excercise4Main {
	static String firstname;
	static String lastname;
	public static void main(String[] args) throws EmployeeNameException {
		// TODO Auto-generated method stub
		Scanner employeename = new Scanner(System.in);
		System.out.println("Enter the first name");
		firstname=employeename.nextLine();
		System.out.println("Enter the last name");
		lastname=employeename.nextLine();
		EmployeeFullNameFun object = new EmployeeFullNameFun();
		object.EmployeeName(firstname,lastname);
		

	}

}
