package com.capgemini.lab5.exercise4;

public class EmployeeFullNameFun {
	public void EmployeeName(String firstname,String lastname) throws EmployeeNameException
	{
		
		try
		{
			if(firstname.isEmpty() && lastname.isEmpty())
			{
				throw new EmployeeNameException("ERROR Both the fields of the Employee name are Empty");
			}
		}
		catch(Exception exceptionmessage)
		{
			System.out.println(exceptionmessage);
		}
	}

}
