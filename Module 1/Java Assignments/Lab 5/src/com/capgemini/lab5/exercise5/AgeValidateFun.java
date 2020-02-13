package com.capgemini.lab5.exercise5;

public class AgeValidateFun  {
	public void validateage(int age) throws AgeException
	{
		try
		{
			if(age<=15)
			{
				throw new AgeException(" Age of a person should be above 15.");
			}
		}
		catch(Exception excptionmessage)
		{
			System.out.println(excptionmessage);
		}
	}

}
