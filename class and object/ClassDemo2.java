import java.util.Scanner;
class Student
{
	String name;
	int roll;
	float per;

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

	public Student(String name)
	{
		this.name = name;
	}

	public Student(int roll)
	{
		this.roll = roll;
	}

	public Student(float per)
	{
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

	public String getName(){ return this.name;}
	public int getRoll(){ return this.roll;}
	public float getPer(){ return this.per;}

	public void inputData()
	{
		System.out.print("Enter Your Name: ");
		this.name = sc.nextLine();

		System.out.print("Enter You Roll No: ");
		this.roll = sc.nextInt();

		System.out.print("Enter Your Persentage: ");
		this.per = sc.nextFloat();
	}

	public void showData()
	{
		if(name == null || roll == 0 || per == 0)
		{
			throw new NullPointerException("Please Fill this ");
		}
		else {
			
		System.out.println("\nYour Name = " + this.name);
		System.out.println("Roll No = " + this.roll);
		System.out.printf("Persentage = %f%%",this.per);

			}
	}
}

class ClassDemo2
{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.inputData();
		s1.showData();
	}
}