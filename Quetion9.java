import java.util.Scanner;
class Quetion9
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter days");
		int days = scan.nextInt();

		int m = days / 365;
		int d = days % 365;
		
		System.out.println(m);
		System.out.println(d);
		
	}
}