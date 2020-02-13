package Com.cg.lab1.basic;

import java.util.Scanner;

public class IncreasingNumber {
	public static boolean checkNumber(int n)
	{
		int r= String.valueOf(n).length();
		for(int i=1;i<r;i++)
		{
			int x=n%10;
			n=n/10;
			int x1=n%10;
			if(x1>x)
			{
				return(false);
			}
		}
	      return(true);
	}
public static void main(String...rk)
{
	
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	System.out.print(checkNumber(n));
	sc.close();
}

}
