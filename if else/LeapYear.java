import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) {
		
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Check Year is Leap?....\n\n");

		System.out.print("Enter Any Year: ");
		year = sc.nextInt();

		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
		{

			System.out.println("Year is Leap...");
		}
		else 
		{
			System.out.println("Year Is Not leap...");
		}
	}
}