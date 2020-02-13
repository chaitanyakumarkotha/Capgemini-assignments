package com.capgemini.lab6.exercise3;

public class StringReverse {
	public StringBuilder stringrev(String s)
	{
		//String j=s;
		//created to stringbuilders to reverse and append the string
		StringBuilder sb=new StringBuilder(s);//StringBuilder is mutable.
		StringBuilder sb1=new StringBuilder(s);
		sb.reverse();//inbuilt function to reverse 
		sb1.append("|"+sb);//attaches both sbuilders together separated by a pipe.
		return sb1;
	}

}
