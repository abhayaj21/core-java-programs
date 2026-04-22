import java.util.Scanner;

class SwapDigit
{
	public static void main(String[] args) {

		int no,d1,d2,d3,d4,d5,swap;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any 5 Digit Number: ");
		no = sc.nextInt();


		d5 = no % 10;

		no = no / 10;

		d4 = no % 10;

		no = no / 10;

		d3 = no % 10;

		no = no / 10;

		d2 = no % 10;

		d1 = no / 10;

     	swap = (d5 * 10000) + (d2 * 1000) + (d3 * 100) + (d2 * 10) + d1;

     	System.out.println("After Swap First and Last Digit");
     	System.out.println("nnew Digit = " + swap);

	}
}