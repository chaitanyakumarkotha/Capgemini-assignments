package com.capgemini.lab6.exercise8;

public class PositiveString {
	public void checkstring(String string)
	{
		int indexforstring,count=0;
		for(indexforstring=0;indexforstring<(string.length()-1);indexforstring++)
		{
			if(string.charAt(indexforstring)<string.charAt(indexforstring+1))
			{
				count=count+1;
			}
			
		}
		if(count==string.length())
		{
			System.out.println("Positive String");
		}
		else
		{
			System.out.println("Not Positive String");
		}
		
	}

}
