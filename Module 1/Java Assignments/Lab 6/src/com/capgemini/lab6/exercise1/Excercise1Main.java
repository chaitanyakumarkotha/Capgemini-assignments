package com.capgemini.lab6.exercise1;
import java.util.*;
public class Excercise1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the No with , in b/w");
		s=input.nextLine();
		StringTokenizerFun f= new StringTokenizerFun();
		System.out.println(f.stringtoknizer(s));
		

	}

}
