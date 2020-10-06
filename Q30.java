//30.	Create an integer type 2-D array of size [3X3]. Take the elements from the user
//and then calculate the sum of the elements present in the diagonal.

import java.util.Scanner;
public class Q30 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int i;
		int j;
		int sum = 0;
		int sum1 = 0;
		int arr1[][] = new int[3][3];
		
		System.out.println("Enter the elements in array:");
		for(i = 0; i<arr1.length;i++)
		{
			for(j = 0;j < arr1[i].length;j++)
			{
				//System.out.println(arr1[i][j]);
				arr1[i][j] = scan.nextInt();
			}
		}
		//scan.close();
		
	System.out.println("2D array");
	for(i = 0; i<arr1.length;i++)
	{
		for(j = 0;j < arr1[i].length;j++)
		{
			//sum = sum + arr1[i][j];
			//System.out.println(arr1[i][j]);
			if(i == j)
			{
				//System.out.println();
				sum = sum + arr1[i][j];
			}
			if((i+j) == (arr1.length -  1))
			{
				sum1 = sum1 + arr1[i][j];
			}
		}
	}
	System.out.println("sum is :"+sum);
	System.out.println("sum1 is :"+sum1);
}
}