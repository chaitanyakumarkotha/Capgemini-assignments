package com.cg.lab3.assignments;
import java.util.*;
public class ReverseOfNumber {
	public int reverse(int num)
    {
            int res=0;
            while(num>0)
            {
                    
                    res=(res*10)+(num%10);
                    num/=10;
            }
            return res;                
    }
    public int[] getSorted(int []arr)
    {
            for(int i=0;i<arr.length;i++)
            {
                    arr[i]=reverse(arr[i]);
            }
            Arrays.sort(arr);
    
            return arr;
            
    }
    public static void main(String[] args) {
            // TODO Auto-generated method stub
    	ReverseOfNumber d=new ReverseOfNumber();
            int arr[]={562,3,54,89,52,11,32,87};
            arr=d.getSorted(arr);
            for(int i=0;i<arr.length;i++)
            {
                    System.out.println(arr[i]);
            }
           
    }

}
