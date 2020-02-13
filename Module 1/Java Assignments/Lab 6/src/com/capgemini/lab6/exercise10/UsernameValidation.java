package com.capgemini.lab6.exercise10;

public class UsernameValidation {
	boolean bool;
	public  boolean validation(String username)
	{
		
		int usrnamelength;
		usrnamelength = username.length();
		String check;
		check =username.substring(usrnamelength-4);
		if(usrnamelength>11)
		{
			if(username.substring(usrnamelength-4).equals(check))
			{
			
				bool=true;
			}
			else
			{
				bool=false;
			}
		}
		else
		{
			bool = false;
		}
		return bool;
	}

}
