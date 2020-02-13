package com.cg.lab3.assignments;

public class ToUpperclass {
	public String[] stringSort(String[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j].compareTo(arr[i])<0)
                {
                    
                    String s=arr[i];
                    arr[i]=arr[j];
                    arr[j]=s;
                }
            }
        }
        int startpointer=0;
        int endpointer=arr.length-1;
        
        while(startpointer<=endpointer)
        {
            arr[startpointer]=arr[startpointer].toUpperCase();
            startpointer++;
            if(startpointer<endpointer)
            {
                arr[endpointer]=arr[endpointer].toLowerCase();
                endpointer--;
            }
        }
        
        return arr;
    }

    public static void main(String[] args)
    {
   
        String string_arr[]={"hemanth","kitten","duck","camel","lion"};
        ToUpperclass d=new ToUpperclass();
        string_arr=d.stringSort(string_arr);
        for(int i=0;i<string_arr.length;i++)
        {
            System.out.println(string_arr[i]);
        }
        
    }

}

