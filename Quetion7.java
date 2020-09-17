import java.util.Scanner;
class Quetion7
{
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks of 5 subject");

		int sub1  = scan.nextInt();
		int sub2  = scan.nextInt();
		int sub3  = scan.nextInt();
		int sub4  = scan.nextInt();
		int sub5  = scan.nextInt();

		int total = sub1 + sub2 + sub3 + sub4 + sub5;

		double percentage = (total * 100) / 500;

		System.out.println("Average is:"+percentage);
		

	}
}