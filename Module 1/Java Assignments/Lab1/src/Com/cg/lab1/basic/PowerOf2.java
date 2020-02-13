package Com.cg.lab1.basic;

public class PowerOf2 {
	  public static void main(String[] args)
	  {
	  System.out.println(b(8));
	  }
	
public static boolean b(int number)
{
	while(number > 1)
	  {
		if(number % 2 != 0)
		{
	    return false;
	    }
	   number = number / 2;
	  }
	  return true;
	 }
	 
	}
