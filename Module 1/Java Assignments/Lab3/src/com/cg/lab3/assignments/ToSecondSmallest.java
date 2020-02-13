package com.cg.lab3.assignments;

public class ToSecondSmallest {
	public static void second(int[] arr)
	{
		int n=arr.length;
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			
			if(min>arr[i]){
				min=arr[i];
			}
		}
		int sec_min=65000;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>min && sec_min>arr[i])
			{ 
				
				sec_min=arr[i];
				
			}
		}
		System.out.println(sec_min);
	}

	public static void main(String[] args) {
		int arr[]={5,6,8,4,10};
		second(arr);
		// TODO Auto-generated method stub

	}

}
