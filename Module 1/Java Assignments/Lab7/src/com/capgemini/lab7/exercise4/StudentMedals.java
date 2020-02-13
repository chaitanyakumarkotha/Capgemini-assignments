package com.capgemini.lab7.exercise4;

import java.util.HashMap;
import java.util.Map.Entry;

public class StudentMedals {
	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	HashMap<Integer,String> hm1=new HashMap<Integer,String>();
	public void getMedals()
	{
		for(Entry<Integer, Integer> m:hm.entrySet()){    
		    
			if(m.getValue()>=90)
		       {
		    	   hm1.put(m.getKey(), "Gold");
		       }
			else if(m.getValue()>=80 && m.getValue()<90)
			{
				hm1.put(m.getKey(), "Silver");
			}
			else if(m.getValue()>=70 && m.getValue()<80)
			{
				hm1.put(m.getKey(), "Bronze");
			}
			
		      }
		for(Entry<Integer, String> m:hm1.entrySet()){    
		       System.out.println(m.getKey()+":"+m.getValue());    
		      }  

	}
	public void createHashmap()
	{
		hm.put(11604621, 90);
		hm.put(11604622, 85);
		hm.put(11604623, 75);
		hm.put(11604624, 65);
		hm.put(11604625, 55);
		
	}

}
