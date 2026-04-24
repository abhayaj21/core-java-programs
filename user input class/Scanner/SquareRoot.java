import java.util.Scanner;

class SquareRoot
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no,sqrt;
		System.out.print("Enter Any Number: ");
		no = in.nextInt();

		sqrt = (int)Math.sqrt(no);
		System.out.println("Square Root = " + sqrt);
	}
}