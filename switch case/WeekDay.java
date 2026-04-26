import java.util.Scanner;

class WeekDay
{
	public static void main(String[] args) {
		int no1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Week Day Number: ");
		no1 = sc.nextInt();

		switch(no1)
		{

		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wensday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Wrong Input...");
		}
	}
}