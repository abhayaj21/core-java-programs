import java.util.Scanner;
import java.util.InputMismatchException;
class Employee{
	private int id;
	private String name;
	private float basicSalaray;

	static Scanner sc = new Scanner(System.in);

	public Employee()
	{

	}

	public Employee(int id, String name, float basicSalaray)
	{
		this.id = id;
		this.name = name;
		this.basicSalaray = basicSalaray;
	}

	public Employee(int id)
	{
		this.id = id;
	}

	public Employee(String name)
	{
		this.name = name;
	}

	public Employee(float basicSalaray)
	{
		this.basicSalaray = basicSalaray;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setBasicSalray(float basicSalaray)
	{
		this.basicSalaray = basicSalaray;
	}

	public int getId(){return id;}
	public String getName(){return name;}
	public float getBasicSalaray(){return basicSalaray;}

	public void showSalaraySleep(){
		System.out.println("\nEmployee Id             = " + id);
		System.out.println("Employee Name             = " + name);
		System.out.println("Employee Basic Salaray    = " + basicSalaray);
	}

	public void inputData(){

		try{
		System.out.print("Enter Employee Id: ");
		id = sc.nextInt();
		System.out.print("Enter Employee Name: ");
		name = sc.next();
		System.out.print("Enter Basic Salaray: ");
		basicSalaray = sc.nextFloat();
		}
		catch(InputMismatchException im)
		{
			System.out.println(im.getMessage());
		}
	}
}

class EmployeeDemo
{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		float ta,da,hra,grossSalaray;

		e1.inputData();
		ta = e1.getBasicSalaray() * 5 / 100;
		da = e1.getBasicSalaray() * 10 / 100;
		hra = e1.getBasicSalaray() * 15 / 100;
		grossSalaray = ta + da + hra;

		e1.showSalaraySleep();
		
		System.out.println("TA                        = " + ta);
		System.out.println("DA                        = " + da);
		System.out.println("HRA                       = " + hra);
		System.out.println("Gross Salaray             = " + grossSalaray);

	
	}
}