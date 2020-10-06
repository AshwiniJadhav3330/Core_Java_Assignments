/*
 * 37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of
 Person class by creating Person object and calling methods.

 * 
 */

class Person
{
	private int age;
	private String name;
	
	Person()
	{
		age = 18;
	}
	Person(int age,String name)
	{
		//this.age=age;
		this();
		this.name=name;
	}
	void show()
	{
		System.out.println("Age is:"+age);
		//this(age);
		System.out.println("name is:"+name);
	}
}
public class Q37
{
	public static void main(String args[])
	{
		//Person p1 = new Person();
		Person p = new Person(11,"Ashu");
		p.show();
	}
}
