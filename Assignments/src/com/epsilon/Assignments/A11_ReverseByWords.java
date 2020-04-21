package src.com.epsilon.Assignments;

public class A11_ReverseByWords {

	public static String reverseByWords(String sentence) { 
		// do stuff here
		String str[]=sentence.split(" ");
		String str1="";
		for(int i=str.length-1;i>=0;i--)
		{
			str1+= str[i]+" ";
		}
		return str1;
	}
	
	public static void main(String[] args) {
		String out = reverseByWords("my name is Shreyas and i live in bangalore");
		System.out.println(out);
	}
}
