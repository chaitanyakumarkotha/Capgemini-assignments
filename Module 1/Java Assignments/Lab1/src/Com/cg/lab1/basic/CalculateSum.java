package Com.cg.lab1.basic;

public class CalculateSum {
	static int sum(int num)
	{
	int sum=0;
	for(int count=1;count<=num;count++)
	{
		if(count%3 == 0 || count%5 == 0)
	 	sum=sum+count;
	}
	return(sum);
	}
	public static void main(String...rk)
	{
		int num=100;
		System.out.println("the sum is"+" "+sum(num));
	}
}
