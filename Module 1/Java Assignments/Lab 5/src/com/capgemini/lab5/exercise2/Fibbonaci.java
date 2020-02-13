package com.capgemini.lab5.exercise2;

public class Fibbonaci {
	public int FibonacciNormal(int n) throws FibonnaciException
	{
		try
		{
			if(n<0)
			{
				throw new FibonnaciException("Wrong input:Fibonacci not exists for -ve no");
			}
		}
		catch(Exception exceptionmessage)
		{
			System.out.println(exceptionmessage);
		}
		
		if(n<=1)
		{
			return (1);
		}
		int PreviousNumber=1,NextNumber=1,Sum=0;
		for(int i=2;i<n;i++)
		{
			Sum = PreviousNumber+NextNumber;
			PreviousNumber=NextNumber;
			NextNumber=Sum;
		}
		return Sum;
		}
		
	
	public int FibonacciRecursive(int n)
	{
		try
		{
			if(n<0)
			{
				throw new FibonnaciException("Wrong input:Fibonacci not exists for -ve no");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		if (n <= 1) 
		      return n; 
		    return FibonacciRecursive(n-1) + FibonacciRecursive(n-2);
		}
	

}
