import java.util.Scanner;
class Quetion8
{
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the balance");
		int p = scan.nextInt();

		System.out.println("Enter the rate of interest");
		int r = scan.nextInt();

		System.out.println("Enter the time in years");
		int t = scan.nextInt();

		double a = p * (1+ r * t);
		System.out.println(a);
}
}
