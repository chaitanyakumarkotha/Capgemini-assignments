package com.capgemini.lab7.exercise2;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountCharHashmap {
	public void frequencyofchararray(char[] arr)
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		String combinedchars = new String(arr);
		char allcharacters,eachcharacter;
		int stringlength = combinedchars.length();
		int count,combinedcharsindex;
		for(allcharacters='A';allcharacters<='z';allcharacters++)
		{
			count=0;
			for(combinedcharsindex=0;combinedcharsindex<stringlength;combinedcharsindex++)
			{
				eachcharacter = combinedchars.charAt(combinedcharsindex);
				if(eachcharacter==allcharacters)
				{
					count++;
				}
			}
			 if(count>0)
	            {
	                //System.out.println("The character " + allcharacters + " has occurred for " + count + " times");
				 String gav = String.valueOf(allcharacters);	
				 hm.put(gav,count);
	            }
		}
		for(Entry<String, Integer> m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
				

	}

}
