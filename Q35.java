/*35.	Create a class MathOperation that has four static methods. add() method that takes
 *  two integer numbers as parameter and returns the sum of the numbers. subtract() method that
 *  takes two integer numbers as parameter and returns the difference of the numbers. multiply()
 *  method that takes two integer numbers as parameter and returns the product. power() method
 *  that takes two integer numbers as parameter and returns the power of first number to
 *  second number. Create another class Demo (main class) that takes the two numbers from
 *  the user and calls all four methods of MathOperation class by providing entered numbers 
 *   and prints the return values of every method.
 * 
 */
class MathOperation
{
	//private int a,b;
	//static int sum = 0;
	static int add(int a,int b)
	{
		return  a + b;
		//return sum;
	}
	
	static int Substract(int a,int b)
	{
		return  a - b;
		//return sum;
	}
	
	static int Multiply(int a,int b)
	{
		return  a * b;
		//return sum;
	}
	
	static int division(int a,int b)
	{
		return  a / b;
		//return sum;
	}
	
}

public class Q35
{
	public static void main(String args[])
	{
		 //MathOperation m = new  MathOperation();
		 int a= MathOperation.add(2,3);
		 System.out.println("Addition is:"+a);
		 
		 int a1= MathOperation.Substract(2,3);
		 System.out.println("Substraction is:"+a1);
		 
		 int a2= MathOperation.Multiply(2,3);
		 System.out.println("Multiplication is:"+a2);
		 
		 int a3= MathOperation.division(12,3);
		 System.out.println("Division is:"+a3);
		 
		
	}
}
