package src.com.epsilon.Assignments;

public class A12_NumToWords {

	static void convert_to_words(int num) {
		int temp = num;
		int len = 0;
		while (temp != 0) {
			temp /= 10;
			len++;
		}

		if (len == 0) {
			System.out.println("empty string");
			return;
		}
		if (len > 9) {
			System.out.println("Length more than 9 is not supported");
			return;
		}
		String[] single_digits = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
				"nine" };

		String[] two_digits = new String[] { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
				"seventeen", "eighteen", "nineteen" };

		/* The first two string are not used, they are to make array indexing simple */
		String[] tens_multiple = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
				"eighty", "ninety" };

		String[] tens_power = new String[] { "hundred", "thousand", "lakhs", "crores" };

		System.out.println(num);
		char[] nums = String.valueOf(num).toCharArray();
		String wordString = "";
		int x = 0;
		if (len == 9 && Character.getNumericValue(nums[x]) == 1) {
			wordString += two_digits[Character.getNumericValue(nums[x + 1])] + " crores ";
			x += 2;
			len -= 2;
		}
		if (len == 9 && Character.getNumericValue(nums[x]) != 1) {
			wordString += tens_multiple[Character.getNumericValue(nums[x])] + " ";
			len -= 1;
			x++;
		}
		if (len == 8) {
			wordString += single_digits[Character.getNumericValue(nums[x])] + " crores ";
			len--;
			x++;
		}

		if (len == 7 && Character.getNumericValue(nums[x]) == 1) {
			wordString += two_digits[Character.getNumericValue(nums[x + 1])] + " lakhs ";
			len -= 2;
			x += 2;
		}
		if (len == 7 && Character.getNumericValue(nums[x]) != 1) {
			wordString += tens_multiple[Character.getNumericValue(nums[x])] + " ";
			len -= 1;
			x++;
		}

		if (len == 6) {
			wordString += two_digits[Character.getNumericValue(nums[x])] + " lakhs ";
			len--;
			x++;
		}

		if (len == 5 && Character.getNumericValue(nums[x]) == 1) {
			wordString += two_digits[Character.getNumericValue(nums[x+1])] + " thousand ";
			len-=2;
			x+=2;
		}
		
		if (len == 5 && Character.getNumericValue(nums[x]) != 1) {
			wordString += tens_multiple[Character.getNumericValue(nums[x])] + " ";
			len -= 1;
			x++;
		}

		if (len == 4) {
			wordString += single_digits[Character.getNumericValue(nums[x])] + " thousand ";
			len--;
			x++;
		}

		if (len == 3) {
			wordString += single_digits[Character.getNumericValue(nums[x])] + " hundred and ";
			len--;
			x++;
		}
		if (len == 2 && Character.getNumericValue(nums[x]) == 1) {
			wordString += two_digits[Character.getNumericValue(nums[x + 1])] + " ";
			len -= 2;
		}

		if (len == 2 && Character.getNumericValue(nums[x]) != 1) {
			wordString += tens_multiple[Character.getNumericValue(nums[x])] + " ";
			len -= 1;
			x++;
		}

		if (len == 1) {
			wordString += single_digits[Character.getNumericValue(nums[x])] + " ";
			len--;
			x++;
		}

		System.out.println(wordString);

	}

	// Driver Code
	public static void main(String[] args) {
		convert_to_words(121212121);
		convert_to_words(1212);
		convert_to_words(211415172);
	}
}
