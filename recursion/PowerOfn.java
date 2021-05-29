package recursion;

public class PowerOfn {
    static int count=0;
	public static void main(String[] args) {
	System.out.println(pow(3,10));	
System.out.println("Steps count="+count);
count=0;
System.out.println(fastpow(3,10));
System.out.println("fast count="+count);
	}
	static double pow(double a,double n)
	{
		count++;
		if(n==0)
		{
			return 1;
		}
		
			return a*pow(a,n-1);
		
	}
	static double fastpow(double a,double n)
	{
		count++;
		if(n==0)
		{
			return 1;
		}
		if(n%2==0)
		{
			return fastpow(a*a,n/2);
		}
		return a* fastpow(a,n-1);
	}

}
