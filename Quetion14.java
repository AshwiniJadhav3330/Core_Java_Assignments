import java.util.Scanner;

class Quetion14
{

	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year");

		int year = scan.nextInt();
		if(year % 4 == 0 || year / 4 == 0 || year / 400 == 0)
		{
			System.out.println("Year is leap year");
		}
		else
		{
			System.out.println("Year is not leap year");
		}
	
	}
}