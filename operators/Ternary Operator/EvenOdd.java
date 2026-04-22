import java.util.Scanner;

class EvenOdd
{
	public static void main(String[] args) {
		
		int no;
		String check;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No: ");
		no = sc.nextInt();

		check = (no % 2 == 0) ? "No is Even" : "No is Odd";

		System.out.println(check);

	}
}