package com.capgemini.lab5.exercise6;

public class EmployeeSalaryFun {
	public void employeesalary(int salary) throws EmployeeException
	{
		try
		{
			if(salary<3000)
			{
				throw new EmployeeException("salary of an employee is below than 3000");
			}
		}
		
		catch(Exception exceptionmessage)
		{
			System.out.println(exceptionmessage);
		}
	}

}
