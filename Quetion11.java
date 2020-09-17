import java.util.Scanner;

class Quetion11
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("value of a before swapping is:"+a);
		System.out.println("value of b before swapping is:"+b);

		
		int c = a + b;
		
		a = c - a;
		b = c - b;
		
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);

	}
}