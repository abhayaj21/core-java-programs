import java.util.Scanner;

class ShowDigit
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num,d1,d2;
		System.out.print("Enter Any Two Digit Number: ");
		num = in.nextInt();

		d1 = num / 10;
		d2 = num % 10;

		System.out.println("Digit 1 = " + d1);
		System.out.println("Digit 2 = " + d2);
	}
}