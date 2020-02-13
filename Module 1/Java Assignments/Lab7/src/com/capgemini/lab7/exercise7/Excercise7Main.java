package com.capgemini.lab7.exercise7;



public class Excercise7Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,32,45,87,98,79};
		ReveseNdSorting object = new ReveseNdSorting();
		
		//ArrayList <Integer> = new ArrayList <Integer> (object.getSorted(arr));
		for(Integer no : object.getSorted(arr))
		{
			System.out.println(no);
		}
		

	}

}
