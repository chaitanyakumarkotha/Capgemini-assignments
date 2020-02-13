package com.cg.lab4.operators;

import java.util.Scanner;

public class Cubesum 
{
	static int input=0;
	public static void main(String args[]){
	    System.out.println("Enter a Number");
	    Scanner sc = new Scanner(System.in);
	    input= Integer.parseInt(sc.nextLine());
        Sumofcubes(input);   
        sc.close();
	    }   
public static int Sumofcubes(int num)
{
	 int number = input; //number is a temp variable
	 int counter = 0;
     int sum=0;
     while(number>0)
     {
    	 int t= number%10;
		 System.out.println("Cube of "+t +" is "+(t*t*t));
		 sum += t*t*t;
		 counter = counter+1;
		 number = number/10;
	   }
	    System.out.println(sum);
		return sum;
	    }


	}
