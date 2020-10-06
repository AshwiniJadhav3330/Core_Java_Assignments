/*34.	Create a class Circle that has two data members, one to store the radius and another 
 * to store area and three methods first init() method to input radius from user, second 
 * calculateArea() method to calculate area of circle and third display() method to display 
 * values of radius and area. Create class CircleDemo ( main class) that creates the Circle object
 *  and calls init(),calculateArea() and display() methods.
 * 
 * 
 */
import java.util.Scanner;
class Circle
{
	private int radius;
	private double area;
	
	void init(int radius) 
	{
		this.radius = radius;
	}
	double calculateArea()
	{
		area = radius * radius * 3.14;
		//System.out.println("Area of the circle is:"+area);
		return area;
		
	}
	void display()
	{
		System.out.println("Area of the circle is:"+area);
	}
}


public class Q34 
{
	public static void main(String args[])
	{
		Circle a = new Circle();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius:");
		int radius = scan.nextInt();
		a.init(radius);
		a.calculateArea();
		a.display();
		
	}
}
