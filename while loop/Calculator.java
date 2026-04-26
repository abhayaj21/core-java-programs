import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no1,no2,res = 0 , choice = 0;
		System.out.print("Enter First No: ");
		no1 = sc.nextInt();
		System.out.print("Now, Enter Second No: ");
		no2 = sc.nextInt();
		System.out.println("\n----------------------");
		while (true) {
			System.out.println("\n1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.print("\nEnter Your Choice: ");
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				res = no1 + no2;
				break;
			case 2:
				res = no1 - no2;
				break;
			case 3:
				res = no1 * no2;
				break;
			case 4:
				res = no1 / no2;
				break;
			case 5:
				System.exit(0);
			}

			System.out.println("\nResult = " + res);
		}
	}
}