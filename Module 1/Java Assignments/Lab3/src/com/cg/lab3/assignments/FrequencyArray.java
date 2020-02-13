package com.cg.lab3.assignments;

import java.util.Scanner;

public class FrequencyArray {
	public static void freq(String str)
	{
		int n=str.length();
		for(int i='A';i<='Z';i++)
		{
			int k=0;
			for(int j=0;j<n;j++)
			{
				char ch=str.charAt(j);
				if(i==ch)
				{
					k++;
				}
			}
			if(k>0)
			{
				System.out.println("this"+i+"has occured"+k+"times");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		freq(str);
		// TODO Auto-generated method stub

	}

}
