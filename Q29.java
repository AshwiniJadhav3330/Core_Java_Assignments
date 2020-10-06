//29.	Write a program to print the total number of one-D arrays in a two-D array and the 
//number of elements in every one-D array present in the two-D arrays.

public class Q29
{
	public static void main(String args[])
	{
		int arr[]= {10,20,30,40,50,60,70,80,90};
		int arr1[][]= {
						{10,20,30,40},
						{50,60,70,80,90}
					  };
	
	System.out.println("1D array");
	for(int oned : arr)
	{
		System.out.println(oned);
	}
	
	System.out.println("2D array");
	for(int i = 0; i<arr1.length;i++)
	{
		for(int j = 0;j < arr1[i].length;j++)
		{
			System.out.println(arr1[i][j]);
		}
	}
}
}