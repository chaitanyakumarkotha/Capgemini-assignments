package com.capgemini.lab5.exercise1;
import java.util.*;
public class TrafficLightFunction  {
	
	static int inputfromuser;
	public void TrafficLightSwitch() throws TrafficException//user defined exception
	{
		System.out.println("1.Red\n2.Yellow\n3.Green\nEnter the Case U Want:");
		Scanner input = new Scanner(System.in);
		inputfromuser = input.nextInt();
		//setG(inputfromuser);
		try {
		switch(inputfromuser)
		{
		case 1:
		{
			System.out.println("Stop");
			break;
		}
		case 2:
		{
			System.out.println("Ready");
			break;
		}
		case 3:
		{
			System.out.println("Go");
			break;
		}
		default:
		{
			throw new TrafficException("Wrong input");
		}
		
		}
		}
		catch(Exception errormsg)
		{
			System.out.println(errormsg);
		}
	}


}
	
	

