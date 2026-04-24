import java.util.Scanner;
class Employee
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float salray,ta,da,hra,grossSalary;
		System.out.print("Enter Basic Salary: ");
		salray = sc.nextInt();
		ta = salray * 5 / 100;
		da = salray * 10 / 100;
		hra = salray * 15 / 100;
		grossSalary = salray + ta + da + hra;

		System.out.println("Basic Salary  = " + salray);
		System.out.println("TA            = " + ta);
		System.out.println("DA            = " + da);
		System.out.println("HRA           = " + hra);
		System.out.println("Gross Salary  = " + grossSalary);
	}
}