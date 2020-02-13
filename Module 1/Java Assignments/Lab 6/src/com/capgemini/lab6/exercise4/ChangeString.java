package com.capgemini.lab6.exercise4;

import java.util.Scanner;

public class ChangeString  {
	public static String strNext(String s)
	{
		char[] ch = new char[s.length()];//finds the lenofstring
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);//checks every single character 
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'
					||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'
					||ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'
					||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9') {
				
			}
			else
				ch[i]++;
		}
		String s2 = String.valueOf(ch);//converting char to string
		return s2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		s=sc.nextLine();
		
		System.out.println(strNext(s));
	}

}

