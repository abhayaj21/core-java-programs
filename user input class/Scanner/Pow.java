import java.util.Scanner;
class Pow
{
	public static void main(String[] args) {
		
		int x,n,pow;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		x = sc.nextInt();
		System.out.print("Enter Power: ");
		n = sc.nextInt();

		pow = (int)Math.pow(x,n);

		System.out.println("Power = " + pow);
	}
}