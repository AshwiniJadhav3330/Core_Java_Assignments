import java.util.Scanner;
class Quetion6
{
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius of circle");
		int r =scan.nextInt();

		double area = 3.14 * r * r;
		double circum = 2 * 3.14 * r;

		System.out.println("Area of circle is " +area);
		System.out.println(" circumference of circle is " +circum);
	}
}
