package com.capgemini.lab7.exercise3;

import java.util.HashMap;
import java.util.Map.Entry;

public class SquaresHashmap {
	public void squares(int arrofno[])
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int arrindex=0;arrindex<arrofno.length;arrindex++)
		{
			hm.put(arrofno[arrindex], arrofno[arrindex]*arrofno[arrindex]);
		}
		for(Entry<Integer, Integer> m:hm.entrySet()){    
		       System.out.println(m.getKey()+":"+m.getValue());    
		      }  
	}

}
