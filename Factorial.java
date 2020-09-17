import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		int fact = 1;
		int i;
		int size;
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		for( i = 1; i<=size;i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of number is"+fact);
		

	}
}