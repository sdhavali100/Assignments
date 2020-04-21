package src.com.epsilon.Assignments;

public class A10_SumOfEvenOdd {

	private int age;
	public static int[] sumOfEvensAndOdds(int []nums) { 
		// do stuff here
		int[] result = new int[2];
		int even=0;
		int odd=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]%2==0)
				even+=nums[i];
			else
				odd+=nums[i];
		}
		result[0]= even;
		result[1]= odd;
		
		return result;
	}
	
	public static void main(String[] args) {
		int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int [] result =sumOfEvensAndOdds(nums);
		System.out.println(result[0]+" "+result[1]);
	}
}
