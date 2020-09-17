import java.util.Scanner;

class Quetion10
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenhe");

		double f = scan.nextDouble();

		double c= 5*(f-32)/9;
		System.out.println("Temperature in Fahrenhe is:"+c);
	}
}