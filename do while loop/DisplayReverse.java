import java.util.Scanner;
class DisplayReverse
{
	public static void main(String[] args) {
		int no,digit,reverse;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		reverse = 0;
		do{

			digit = no % 10;
			reverse = reverse * 10 + digit;
			no = no / 10;

		}while(no != 0);

		System.out.println("Reverse = " + reverse);
	}
}