import java.util.Scanner;
class Quetion3
{
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x =scan.nextInt();

		int y = x*x + 3*x -  7 ;
		
		
		System.out.println("Value of y is:"+y);

		System.out.println("Enter the value of a");
		int a =scan.nextInt();

		int z = ++a + ++a;

		System.out.println("Value of z is:"+z);
		System.out.println("Value of a is:"+a);

		System.out.println("Enter the value of b");
		int b=scan.nextInt();
		System.out.println("Enter the value of n");
		int n =scan.nextInt();
		int m = b++ - --n - --b +  b++;
		
		System.out.println("Value of m is:"+m);
		System.out.println("Value of z is:"+z);

		System.out.println("Enter the value of xx");
		boolean xx = scan.nextBoolean();
		
		System.out.println("Enter the value of yy");
		boolean yy = scan.nextBoolean();
		boolean zz = xx && yy || !(xx || yy);  

		System.out.println("the value of zz"+zz);

		
	}
}

