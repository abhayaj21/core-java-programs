import java.util.Scanner;

class NoToWord
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,digit,reverse = 0;
		System.out.print("Enter Any Number: ");
		no = sc.nextInt();
		while(no != 0)
		{
			digit = no % 10;
			reverse = reverse * 10 + digit;
			no = no / 10;
		}

		no = reverse;

		while(no != 0)
		{
			digit = no % 10;
			no = no / 10;

			switch (digit) {
			case 0:
					System.out.print("Zero ");
					break;
				case 1:
					System.out.print("One ");
					break;
				case 2:
					System.out.print("Two ");
					break;
				case 3:
					System.out.print("Three ");
					break;
				case 4:
					System.out.print("Four ");
					break;
				case 5:
					System.out.print("Five ");
					break;
				case 6:
					System.out.print("Six ");
					break;
				case 7:
					System.out.print("Seven ");
					break;
				case 8:
					System.out.print("Eith ");
					break;
				case 9:
					System.out.print("Nine ");
					break;
			}
		}
	}
}