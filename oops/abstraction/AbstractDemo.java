import java.util.Scanner;
 
abstract class Student
{
	protected int roll;
	protected String name;
	static Scanner sc = new Scanner(System.in);

	public abstract void show();

	public Student()
	{
		System.out.print("Enter Roll: ");
		this.roll = sc.nextInt();
		System.out.print("Enter Name: ");
		this.name = sc.next();
	}
}


class Test extends Student
{
	protected int totalMarks;

	public void show()
	{
		System.out.println("\nName        = " + name);
		System.out.println("Roll        = " + roll);
		System.out.println("Total Marks = " + totalMarks);
	}

	public Test()
	{
		System.out.print("Enter Total Marks: ");
		this.totalMarks = sc.nextInt();
	}
}


class AbstractDemo
{
	public static void main(String[] args) {
		Student t = new Test();
		t.show();
	}
}