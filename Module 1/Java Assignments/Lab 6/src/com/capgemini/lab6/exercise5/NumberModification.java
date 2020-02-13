package com.capgemini.lab6.exercise5;
import java.lang.Math; 
public class NumberModification {
	StringBuilder stringbuilder = new StringBuilder();
	public int modifyNumber(int number)
	{
		String numberinstring;
		int lenghtofnumber,noatindex;
		numberinstring = String.valueOf(number);
		lenghtofnumber=numberinstring.length();
		for(int i=0;i<lenghtofnumber;i++)
		{
			if(i==lenghtofnumber-1)
			{
				noatindex = numberinstring.charAt(i)-numberinstring.charAt(0);
				stringbuilder.append(Math.abs(noatindex));
			}
		
			else
			{
				noatindex = numberinstring.charAt(i)-numberinstring.charAt(i+1);
				stringbuilder.append(Math.abs(noatindex));
				
			}
			
		}
		number= Integer.parseInt(stringbuilder.toString());
		return number;
	}

}
