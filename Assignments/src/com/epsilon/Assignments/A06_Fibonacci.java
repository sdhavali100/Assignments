package src.com.epsilon.Assignments;

public class A06_Fibonacci {

	public static int fibonacci(int index) {
		// do stuff here
		if (index < 0)
			throw new RuntimeException("Invali Index!!");
		if (index == 0)
			return 0;
		int a = 0;
		int b = 1;
		int fibonacci = 0;
		if (index == 1) {
			return 1;
		}

		for (int i = 1; i < index; i++) {
			fibonacci = a + b;
			a = b;
			b = fibonacci;
		}
		return fibonacci;
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(12));
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(15));
		System.out.println(fibonacci(20));
	}
}
