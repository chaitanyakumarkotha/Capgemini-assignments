package com.capgemini.lab7.exercise8;

public class Excercise8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,12,12,13,13,13,22,55,66,66,22,55};
		DuplicatesNdDescendingArray object = new DuplicatesNdDescendingArray();
		for(int arrindex = 0;arrindex<(object.removeduplicate(arr)).length;arrindex++)
		{
			System.out.println(object.removeduplicate(arr)[arrindex]);
		}
		

	}

}
