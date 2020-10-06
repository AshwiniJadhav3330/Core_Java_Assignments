/*
 * 38.Create a class Employee with three data members (empNo, salary and totalSalary)
 *  and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and 
calls Employee method to display no. of employees and total of their salaries.

 * 
 * 
 * 
 */
class Employee
{
	static int empno=0;
	 int salary;
	static int totalsalary;
	
	Employee(int salary)
	{
		empno++;
		this.salary=salary;
		totalsalary=totalsalary+salary;
		
	}
	void show()
	{
		System.out.println("emp no is:"+empno);
		System.out.println("salary is:"+salary);
		System.out.println("Total salary is:"+totalsalary);
	}
}
public class Q38
{
	public static void main(String args[])
	{
		int arr[]=new int[3];
		Employee e = new Employee(3000);
		Employee e1 = new Employee(4000);
		Employee e3 = new Employee(7000);
		e.show();
		e1.show();
		e3.show();
	}
}
