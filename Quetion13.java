import java.util.Scanner;

class Quetion13
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Three numbers:");
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();

		/*if(n1 > n2 && n1 > n3)
		{
			System.out.println("N1 is greater");	
		}
		else if(n2 > n1 && n2 > n3)
		{
			System.out.println("N2 is greater");	
		}
		else
		{
			System.out.println("N3 is greater");	
		}*/

		int d = n3 >(n1 > n2 ? n1: n2) ? n3: (( n1 > n2) ? n1 : n2);
		System.out.println("Greatest number is"+d);		

		
	}
}