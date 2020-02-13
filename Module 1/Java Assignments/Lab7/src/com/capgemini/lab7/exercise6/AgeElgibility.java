package com.capgemini.lab7.exercise6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AgeElgibility {
	Map<String, Integer> map = new HashMap<String, Integer>();
	public void createhashmap()
	{
		map.put("G1", 18);
		map.put("F82", 21);
		map.put("B13", 8);
		map.put("C65", 85);
	}
	public void eligibility()
	{
		
		List<String> listOfIds = new ArrayList<String>();
		for(Entry<String, Integer> m:map.entrySet())
		{ 
			if(m.getValue()>=18)
			{
				listOfIds.add(m.getKey());
			}
		}
		for(String e : listOfIds)
		{
			System.out.println(e);
		}
	}
}
