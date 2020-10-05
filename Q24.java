//search elements in array;
import java.util.Scanner;
import java.util.*;
public class Q24
{
	public static void main(String args[])
	{
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int arr[]=new int[5];
		
		System.out.println("enter array element");
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
	System.out.println("enter Search element");
	int n = scan.nextInt();
	
	
	for(int i = 0; i<arr.length; i++)
	{
		if(n == arr[i])
		{
			count++;
			System.out.println("match found"+i);
			
		}
		
	}
	if(count != 1)
	{
		System.out.println("match not found");
	}
	
}
}
