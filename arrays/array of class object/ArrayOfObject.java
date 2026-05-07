import java.util.Scanner;

class Student
{
	private String name;
	private int roll;
	private float per;
	static Scanner sc = new Scanner(System.in);

	public Student()
	{

	}

	public Student(String name, int roll, float per)
	{
		this.name = name;
		this.roll = roll;
		this.per = per;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setRoll(int roll)
	{
		this.roll = roll;
	}

	public void setPer(float per)
	{
		this.per = per;
	}

	public String getName(){return name;}
	public int getRoll(){return roll;}
	public float getPer(){return per;}

	public void showData()
	{
		System.out.println("\nStudent Name = " + name);
		System.out.println("Roll = " + roll);
		System.out.println("Persentage = " + per + "%");
	}

	public void inputData()
	{
		System.out.print("\nEnter Student Name: ");
		this.name = sc.next();
		System.out.print("Enter Roll: ");
		this.roll = sc.nextInt();
		System.out.print("Enter Persentage: ");
		this.per = sc.nextFloat();
	}
}

class ArrayOfObject
{
	public static void main(String[] args) {
		Student[] s1 = new Student[5];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < s1.length; i++)
		{
			s1[i] = new Student();
		}

		System.out.println("Enter Data of " + s1.length + " Students");
		for(int i = 0; i < s1.length; i++)
		{
			s1[i].inputData();
		}

		System.out.println("\nAll Student Details");
		for(int i = 0; i < s1.length; i++)
		{
			System.out.println("\nStudent " + (i+1) + " Data");
			s1[i].showData();
		}
	}
}