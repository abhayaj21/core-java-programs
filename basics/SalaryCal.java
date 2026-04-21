class SalaryCal
{
	public static void main(String args[])
	{
		int totalsalary,totaldays,presentdays,actualsalary,onedaysalary;
		totalsalary = 15000;
		totaldays = 30;
		onedaysalary = totalsalary / totaldays;
		presentdays = 20;
		actualsalary = onedaysalary * presentdays;

		System.out.println("Total Salary = " + totalsalary);
		System.out.println("Total Days = " + totaldays);
		System.out.println("Present Days = " + presentdays);
		System.out.println("Actual Salary = " + actualsalary);
	}
}