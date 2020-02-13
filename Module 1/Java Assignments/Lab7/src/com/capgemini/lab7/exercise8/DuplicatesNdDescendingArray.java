package com.capgemini.lab7.exercise8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicatesNdDescendingArray {
	public Object[] removeduplicate(int arr[])
	{
		int size=0;
		HashSet<Integer> set=new HashSet();
		for(int arrindex=0;arrindex<arr.length;arrindex++)
		{
			set.add(arr[arrindex]);
		}
		 Set<Integer> hashSetToTreeSet = new TreeSet<Integer>(set);
		 TreeSet <Integer> reverse = (TreeSet<Integer>) ((TreeSet<Integer>) hashSetToTreeSet).descendingSet();
		 Object[] objArray = reverse.toArray();
		 return objArray;
		 
		 
		 

		
	}

}
