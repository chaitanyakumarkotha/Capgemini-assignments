package Com.cg.lab1.basic;

public class CalculateDifference 
{
	public static void main(String...rk)
	{
		int num=100;
		int r=calDiff(num);
		System.out.println(r);
		
	
	}
	public static int calDiff(int num) {
		int sum=0;
		int sum1=0;
		for(int input=1;input<=num;input++)
		{
			sum=sum+input;
			sum1=sum1+(input*input);
		}
		sum=sum*sum;
		int num1=sum-sum1;
		return num1;
	}
}
