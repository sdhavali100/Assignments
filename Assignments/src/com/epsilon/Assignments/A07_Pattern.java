package src.com.epsilon.Assignments;

public class A07_Pattern {

	public static void pattern(int rows) {
		for(int i=0;i<rows; i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		pattern(5);
		pattern(4);
		pattern(6);
	}
}
