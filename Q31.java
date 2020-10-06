/*31.	Create a class Student with 2 data members rno and name. Create one method setData()
that takes roll number and student name as parameter and stores them in data members rno and 
name. Create one more method showData() to print the data member values. Create another class
( main class) StudentDemo that creates Student class object and calls setData() and showData() 
methods.*/

class Student
{
	private int rno;
	private String name;
	
	Student(int rno,String name)
	{
		this.rno = rno;
		this.name=name;
	}
	void setData(int rno,String name)
	{
		//rno = 100;
		//name = "Ashwini";
		System.out.println("Roll Number is:"+rno);
		System.out.println("Name is:"+name);
	}
	void showData()
	{
		System.out.println("Roll Number is:"+rno);
		System.out.println("Name is:"+name);
	}
}

public class Q31 
{
	public static void main(String args[])
	{
		Student q = new Student(102,"Shruti");
		q.setData(101,"Anuja");
		q.showData();
		
	}
}
