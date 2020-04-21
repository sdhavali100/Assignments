package src.com.epsilon.Assignments;

public class A04_Sort3Numbers {

	public static void sortThreeNumbers(int a, int b, int c) { 
		// do stuff here
		if(a>b && a>c)
		{
			if(b>c)
			{
				System.out.println(c +" "+ b+" "+a);
			}
			else
			{
				System.out.println(b +" "+ c+" "+a);
			}
		}
		else if(b>a && b>c)
		{
			if(a>c)
			{
				System.out.println(c +" "+ a+" "+b);
			}
			else
			{
				System.out.println(a +" "+ c+" "+b);
			}
		}
		else
		{
			if(a>b)
			{
				System.out.println(b +" "+ a+" "+c);
			}
			else
			{
				System.out.println(a +" "+ b+" "+c);
			}
		}
	}
	
	public static void main(String[] args) {
		sortThreeNumbers(99, 101, 100);
		sortThreeNumbers(1, 11, 100);
		sortThreeNumbers(69, 189, 100);
		sortThreeNumbers(19, 1, 500);
	}
}
