package recursion;

import java.util.Scanner;
  
public class SumOf_nNumber {
	static int count=0;
	public static void main(String[] args) {
		int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n=");
	n=sc.nextInt();
	sc.close();
	System.out.println(sum(n));
System.out.println("steps count="+count);
	}
	static int sum(int n)
	{
		count++;
		if(n==1)
		{
			return 1;
		}
		else
			return n+sum(n-1);
	
	}

}
