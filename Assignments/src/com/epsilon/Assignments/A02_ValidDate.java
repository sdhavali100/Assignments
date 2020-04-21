package src.com.epsilon.Assignments;

public class A02_ValidDate {
	
	static boolean isValidDate(int year, int month, int day) { 
		// do stuff here
		if(year<0)
			return false;
		if(month<1 || month>12)
			return false;
		if(day<1 || day>31)
			return false;
		
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			if(month==2)
				if(day<30)
					return true;
				else
					return false;

		}
		else
		{
			if(month==2)
				if(day<29)
					return true;
				else
					return false;
		}
		
		if(month==4 || month == 6 || month==9 || month==11)
		{
			if(day<31)
				return true;
			else
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {	
		System.out.println(isValidDate(2020, 2, 29));
		System.out.println(isValidDate(2019, 2, 31));
		System.out.println(isValidDate(2019, 2, 30));
		System.out.println(isValidDate(2019, 2, 28));
	}

}
