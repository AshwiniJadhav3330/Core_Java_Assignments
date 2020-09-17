import java.util.Scanner;

class Quetion15
{

	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gender");

		String gender = scan.next();
		
		System.out.println("Enter your Age");
		
		int ma = scan.nextInt();
		
		if(gender == "m" || gender == "f")
		{
			if( ma >= 21)
			{
			System.out.println("Ready for marriage");
			}		
		}
		else
		{
			System.out.println("Not Ready for marriage");
		}

	}
}
