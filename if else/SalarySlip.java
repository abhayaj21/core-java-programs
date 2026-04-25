import java.util.Scanner;

class SalarySlip
{
	public static void main(String[] args) {

		float basicSalary,ta,da,hra,grossSalary,incomeTax,pf,netSalary;
		incomeTax = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Basic Salary: ");
		basicSalary = sc.nextInt();

		if(basicSalary <= 10000)
		{
			ta = basicSalary  * 5 / 100;
			da = basicSalary * 10 / 100;
			hra = basicSalary * 15 / 100;
		}
		else {
			ta = basicSalary  * 10 / 100;
			da = basicSalary * 15 / 100;
			hra = basicSalary * 20 / 100;
		}

		grossSalary = basicSalary + ta + da + hra;

		if(grossSalary < 5000)
		{
			pf = 250;
		}
		else if (grossSalary < 10000) {
			pf = 500;
		}
		else if (grossSalary < 15000) {
			pf = 750;
		}
		else {
			pf = 1000;
			if(grossSalary > 25000)
			{
				incomeTax = (grossSalary - 25000) * 20 / 100;
			}
		}

		netSalary = grossSalary - pf - incomeTax;

		System.out.println("\n------------------------");
		System.out.println("Basic Salary     = " + basicSalary);
		System.out.println("TA               = " + ta);
		System.out.println("DA               = " + da);
		System.out.println("HRA              = " + hra);
		System.out.println("Gross Salary     = " + grossSalary);
		System.out.println("Providend Found  = " + pf);
		if(incomeTax > 0)
		{
			System.out.println("Income Tax       = " + incomeTax);
		}

		System.out.println("----------------------------");
		System.out.println("Net Salary       = " + netSalary);


			
	}
}