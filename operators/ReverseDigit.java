import java.util.Scanner;

class ReverseDigit
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no,d1,d2,d3,reverse;
		System.out.print("Enter Any 3 Digit Number: ");
		no = sc.nextInt();

		d3 = no % 10;

		no = no / 10;

		d2 = no % 10;

		d1 = no / 10;

		reverse = (d3 * 100) + (d2 * 10) + d1;

		System.out.println("Reverse Digit = " + reverse);
	}
}