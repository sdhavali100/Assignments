package src.com.epsilon.Assignments;

public class A05_SumOfPrime {
	static boolean isPrimeNumber(int num) { 
		// do stuff here
		int p=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				p++;
			}
		}
		if(p==2)
			return true;
		else
			return false;
	}

	public static int sumOfPrimes(int from, int to) { 
		// do stuff here
		int sum = 0;
		for(int i=from;i<=to; i++)
		{
			if(isPrimeNumber(i))
			{
				sum+=i;
			}
		}
		return sum; 
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfPrimes(3,11));
		System.out.println(sumOfPrimes(2,20));
		System.out.println(sumOfPrimes(30,40));
	}
}
