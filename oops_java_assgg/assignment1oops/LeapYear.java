import java.util.*;

class LeapYear
{
	public static void main(String args[])
	{
		int year;
		System.out.println("Enter an year :");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		
			System.out.println("entered year is leap year");
		
		else
		
			System.out.println("entered year is not leap year");
		
	}
}	