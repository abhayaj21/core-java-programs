import java.util.Scanner;

class CheckYear
{
	public static void main(String[] args) {
		
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Year: ");
		year = sc.nextInt();

		//check = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "This Year is Leap" : "This Year is not a Leap Year";

		System.out.println((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "This Year is Leap" : "This Year is not a Leap Year");
	}
}