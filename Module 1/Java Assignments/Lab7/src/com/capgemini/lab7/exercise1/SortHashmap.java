package com.capgemini.lab7.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashmap {
	Map<String, Integer> map = new HashMap<String, Integer>();
	
	public void createmap()
	{//enter the key and values
		//key must be unique value can have dupilcates
		map.put("MI", 65000);  
		map.put("MOTO", 20000);  
		map.put("ONEPLUS", 32000);  
		map.put("Asus", 21478);  
		map.put("Samsung", 36546);  
		map.put("REALME", 19990);  
		//System.out.println("Before sorting: ");  
		//printMap(map); 
		
	}
	public void sorthashmap()
	{
		int Value;
		Collection<Integer> values = map.values();//storing all values into single collection
		List<Integer> listOfValues = new ArrayList<Integer>(values);//changing to list
		Collections.sort(listOfValues);
		for (Integer value : listOfValues) 
        { 
            System.out.println(value); 
        } 
         
		
	          
	      }
		
	}
	


