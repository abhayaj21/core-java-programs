import java.util.Scanner;
class ShowDigits
{
	public static void main(String[] args) {

		int num,d1,d2,d3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Three Digit Number: ");
		num = sc.nextInt();

		//Last Digit
		d3 = num % 10;
		//Second Digit
		d2 = num / 10;
		d2 = d2 % 10;

		//first Digit

		d1 = num / 10;
		d1 = d1 / 10;


		System.out.println("Digit 1 = " + d1);
		System.out.println("Digit 2 = " + d2);
		System.out.println("Digit 3 = " + d3);
	}
}