package com.capgemini.lab7.exercise7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReveseNdSorting {
	public ArrayList<Integer> getSorted(int arr[])
	{
		int remainder,n;
		for(int arrindex=0;arrindex<arr.length;arrindex++)
		{
			int sum = 0;
			n=arr[arrindex];
			while(n>0)
			{
				remainder = n%10;
				sum = sum * 10 + remainder;
				n = n/10;
			}
			arr[arrindex] = sum;
		}
		ArrayList<Integer> listOfLong = 
				Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
		Collections.sort(listOfLong);
		return listOfLong;
		
	}

}
