package com.capgemini.lab6.exercise1;
//import java.io.*;
import java.util.*;
public class StringTokenizerFun {
	public int stringtoknizer(String s)
	{
		int sum=0;
		 StringTokenizer hem = new  StringTokenizer(s);
		 while(hem.hasMoreTokens())//untill the list is empty the loop will run
		 {
			 sum=sum+Integer.parseInt(hem.nextToken(","));//separates them into tokens separated by (,)
			 
		 }
		 return sum;
	}

}
