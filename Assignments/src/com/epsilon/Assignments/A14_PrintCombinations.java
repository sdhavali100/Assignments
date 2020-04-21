package src.com.epsilon.Assignments;

public class A14_PrintCombinations {

	public static void printAllCombinations(String word, String ans) {
		// do stuff here

		if(word.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		for (int i = 0; i < word.length(); i++) {
			char ch= word.charAt(i);
			
			String remString=word.substring(0,i)+word.substring(i+1);
			printAllCombinations(remString, ans+ch);
			
		}

	}

	public static void main(String[] args) {
		printAllCombinations("abc", "");
	}
}
