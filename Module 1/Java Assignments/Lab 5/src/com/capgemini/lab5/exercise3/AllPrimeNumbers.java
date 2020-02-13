package com.capgemini.lab5.exercise3;

public class AllPrimeNumbers {
	public void primefun(int n) throws PrimeException
	{
		try
		{
			if(n<=1)
			{
				throw new PrimeException("Dont Enter -ve no's and 0.\nPlease enter the +ve no's except 1");
			}
		}
		
		
		catch(Exception exceptionmessage)
		{
			System.out.println(exceptionmessage);
		}
		
		finally
		{
			for(int j=2;j<=n;j++)
			{
			int count=0;
			for(int i=j;i>=1;i--)
			{
				if(j%i==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println(j);
			}
			}
		}
	}


}
