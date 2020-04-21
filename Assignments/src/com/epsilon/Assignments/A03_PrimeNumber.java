package src.com.epsilon.Assignments;

public class A03_PrimeNumber {
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
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(2));
		System.out.println(isPrimeNumber(1));
		System.out.println(isPrimeNumber(3));
		System.out.println(isPrimeNumber(24));
	}
	
}
