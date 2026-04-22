import java.util.Scanner;

class DisplayMaxNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no1,no2,max;
		System.out.print("Enter First No: ");
		no1 = sc.nextInt();
		System.out.print("Enter Second No: ");
		no2 = sc.nextInt();

		max = (no1 > no2)? no1 : no2;
		System.out.println("Max No = " + max);

	}
}