/*
 * 36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate 
 * multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 

 */

class MathOperation1
{
	int sum = 0;
	float mul=0;
	void Multiply(int a,int b)
	{
		sum = a * b;
		System.out.println("2 Arguments multiplication:"+sum);
		
	}
	void Multiply(float x,float y,float z)
	{
		mul = x * y * z;
		System.out.println("3 Arguments multiplication:"+sum);
		
	}
	void Multiply(int arr[])
	{
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);		
		}
		
		
	}
	
	
}
public class Q36
{
	public static void main(String args[])
	{
	MathOperation1 m = new MathOperation1();
	int arr[]= {1,2,3,4,5};
	System.out.println("Array elements Are:");
	m.Multiply(arr);
	
	m.Multiply(2,4);
	
	m.Multiply(2.0f,2.0f,2.0f);
	}
}
