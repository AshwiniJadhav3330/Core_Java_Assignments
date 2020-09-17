import java.util.Scanner;

class Odd
{
	public static void main(String args[])	
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = scan.nextInt();
	//int num2 =scan.nextInt();

	if(num1 % 2 == 0)
	{
		System.out.print("Number is even");	
	}
	else
	{
		System.out.print("Number is odd");
	}
	}
}