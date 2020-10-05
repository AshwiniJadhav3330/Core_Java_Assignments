
import java.util.Scanner;

public class Q21 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[10];
		int sum =0;
		float avg = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			arr[i] = scan.nextInt();
			sum= sum+arr[i];
		}
		
		avg = sum/10;
		System.out.println("Sum is:"+sum);
		System.out.println("Avg is:"+avg);
		
	}
}
