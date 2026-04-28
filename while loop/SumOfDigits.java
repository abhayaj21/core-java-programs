import java.util.Scanner;

class SumOfDigits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,sum,mod;
		System.out.print("Enter Any Digits: ");
		no = sc.nextInt();
		sum = 0;
		while(no != 0)
		{
			mod = no % 10;
			sum = sum + mod;
			no = no / 10;
		}

		System.out.println("Sum of All Digits = " + sum);
	}
}