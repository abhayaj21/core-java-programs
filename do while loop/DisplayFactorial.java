import java.util.Scanner;
class DisplayFactorial
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,factorial = 1;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();

		do
		{
			factorial = factorial * no;
			System.out.print(no + " x ");
			no--;
		}while(no >= 1);

		System.out.println("\b\b= "+ factorial);
	}
}