//A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3 steps at a time. Implement a method to count how many possible ways the child can run up the stairs.n is given by the user

package problemsolving;

public class Steps {

	public static void main(String[] args) {
		int n=3;
		System.out.println(possibleways(n));

	}
	
	//method to calculate the possible ways
	static int possibleways(int n)
	{
		if(n==1||n==0)
			return 1;
		if(n==2)
			return 2;
		else
			return possibleways(n-3)+possibleways(n-2)+possibleways(n-1);
	}

}
