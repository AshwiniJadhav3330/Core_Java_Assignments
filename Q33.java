//33.	Write a program to demonstrate functionalities of this keyword in java. 
class Super1
{
	private int rno;
	private String name;
	
	Super1(int rno,String name)
	{
		this.rno = rno;
		this.name = name;
	}
	void showData()
	{
		System.out.println("Roll Number issss:"+rno);
		System.out.println("Name is:"+name);
	}
	
}
class Base extends Super1
{
	Base(int rno, String name) {
		super(rno, name);
		// TODO Auto-generated constructor stub
	}

	private int age;
	private String gender;
	
	/*Base(int age,String gender)
	{
		this.age = age;
		this.gender = gender;
	}*/
	void showData1()
	{
		System.out.println("Roll Number is:"+age);
		System.out.println("Name is:"+gender);
	}
	
}

public class Q33
{
	public static void main(String args[])
	{
		Base b = new Base(10,"ashu");
		b.showData();
		b.showData1();
	}
}
