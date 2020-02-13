package com.capgemini.lab7.exercise5;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SecondSmallest {
	public int getSecondSmallest(int arrofno[])
	{
	//List arrayofno = new ArrayList(Arrays.asList(arrofno));
		ArrayList<Integer> listOfLong = 
				Arrays.stream(arrofno).boxed().collect(Collectors.toCollection(ArrayList::new));
		Collections.sort(listOfLong);
		return  listOfLong.get(1);
	}

}
