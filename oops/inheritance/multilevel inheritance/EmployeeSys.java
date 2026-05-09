import java.util.Scanner;

class Employee
{
	private int empId;
	private String name;
	protected float basicSalary;

	static Scanner sc = new Scanner(System.in);

	public Employee()
	{
		System.out.print("Enter Employee Name: ");
		name = sc.next();
		System.out.print("Enter Employee ID: ");
		empId = sc.nextInt();
		System.out.print("Enter Basic Salary: ");
		basicSalary = sc.nextFloat();
	}

	public void showEmp()
	{
		System.out.println("\n-----------------------");
		System.out.println("Employee Id    = " + empId);
		System.out.println("Employee Name  = " + name);
		System.out.println("-----------------------");	
		System.out.println("Basic Salary   = " + basicSalary);
		System.out.println("-----------------------");	

	}

	public void setEmpId(int id)
	{
		empId = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setBasicSalary(float bs)
	{
		basicSalary = bs;
	}

	public int getEmpId() {return empId;}
	public String getName() {return name;}
	public float getBasicSalary() {return basicSalary;}
}

class GrossSalary extends Employee
{
	private float TA;
	private float DA;
	private float HRA;

	public GrossSalary()
	{
		TA = getBasicSalary() * 5 / 100;
		DA = getBasicSalary() * 10 / 100;
		HRA = getBasicSalary() * 15 / 100;
	}

	public float getGrossSalary()
	{
		float gs = getBasicSalary() + TA + DA + HRA;
		return gs;
	}

	public void gShow()
	{
		showEmp();
		System.out.println("TA             = " + TA);
		System.out.println("DA             = " + DA);
		System.out.println("HRA            = " + HRA);
		System.out.println("-----------------------");	
		System.out.println("Gross Salary   = " + getGrossSalary());
		System.out.println("-----------------------");	


	}
}

class NetSalary extends GrossSalary
{
	private int pf = 0;
	protected float taxAmt = 0;

	public NetSalary()
	{
		if(getGrossSalary() < 5000)
	{
		pf = 250;
	}
	else if(getGrossSalary() < 10000)
	{
		pf = 500;
	}
	else if(getGrossSalary() < 15000)
	{
		pf = 750;
	}
	else{
		pf = 1000;

		if(getGrossSalary() > 25000)
		{
			 taxAmt = (getGrossSalary() - 25000) * 20 / 100;
		}
	}

}


	public float netSalary()
	{
		float nSalary = getGrossSalary() - pf - taxAmt;
		return nSalary;
	}

	public void showNetSalary()
	{
		gShow();
		System.out.println("Provident Fund = " + pf);
		if(taxAmt > 0)
			System.out.println("Income Tax     = " + taxAmt);

		System.out.println("-----------------------");	
		System.out.println("Net Salary     = " + netSalary());
		System.out.println("-----------------------");

	}

}



class EmployeeSys
{
	public static void main(String[] args) {
		System.out.println("Check Employee Salary Sleep...");
		System.out.println("-------------------------------\n");
		NetSalary n = new NetSalary();
		n.showNetSalary();
	}
}