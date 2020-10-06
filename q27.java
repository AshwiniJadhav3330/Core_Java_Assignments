import java.util.Scanner;
public class q27 {

	public static void main(String[] args)
	{
		int max;
		int min = 0;
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("how many elemnts u want to enter in array:");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elemnts in array:");
		for(i = 0;i<n;i++)
		{
			arr[i] = scan.nextInt();
		}
		/*for(i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}*/
		max = arr[0];
		for(i = 0;i<n;i++)
		{
		if(max < arr[i])
		{
			//System.out.println(max);
			max = arr[i];
		}
		min = arr[0];
		if(min > arr[i])
		{
			//System.out.println(max);
			min = arr[i];
		}
		
		}
		System.out.println("max is:"+max);
		System.out.println("min is:"+min);
		
		}

	}


