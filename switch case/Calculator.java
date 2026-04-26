import java.util.Scanner;
class Calculator
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int choice,no1,no2;
		System.out.println("1. Addition( + )");
		System.out.println("2. Subtraction( - )");
		System.out.println("3. Multiplication( x )");
		System.out.println("4. Division( / )");
		System.out.print("\nEnter Your Choice: ");
		choice = sc.nextInt();

		System.out.print("Enter No1: ");
		no1 = sc.nextInt();
		System.out.print("Enter No2: ");
		no2 = sc.nextInt();

		switch (choice) {
			case 1:
				add(no1,no2);
				break;
			case 2:
				sub(no1,no2);
				break;

			case 3:
				mul(no1,no2);
				break;

			case 4:
				div(no1,no2);
				break;

			default:
				System.out.println("Wrong Choice!");

				
			
		}
	}

	public static void add(int no1, int no2)
	{
		System.out.println("Addition = " + (no1 + no2));
	}

	public static void sub(int no1, int no2)
	{
		System.out.println("Subtraction = " + (no1 - no2));
	}

	public static void mul(int no1, int no2)
	{
		System.out.println("Multiplication = " + (no1 * no2));
	}

	public static void div(int no1, int no2)
	{
		System.out.println("Division = " + (no1 + no2));
	}
}