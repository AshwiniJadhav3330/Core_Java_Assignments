import java.util.Scanner;
public class Q25
{
	public static void main(String args[])
	{	
		int i;
		int evensum = 0;
		int oddsum = 0;
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the elemnts in array:");
		for(i = 0; i<arr.length;i++)
		{
			arr[i] = scan.nextInt();
			
		}
		for(i = 0; i<arr.length;i++)
		{
		if(arr[i] % 2 == 0)
		{
			//System.out.println("");
			evensum = evensum + arr[i];
			
		}
		else
		{
			oddsum = oddsum + arr[i];
		}
		}
		System.out.println(evensum);
		System.out.println(oddsum);
		
	}
}
