import java.util.Scanner;
class CountDigits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,count = 0;
		System.out.print("Enter Any Digit: ");
		no = sc.nextInt();

		while (no != 0) {
			
			no = no / 10;
			count++;
		}

		System.out.println("Total Digits = " + count);
	}
}