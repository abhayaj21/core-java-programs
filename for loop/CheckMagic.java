import java.util.Scanner;
class CheckMagic
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No: ");
		int magic = 0;
		for (int no = sc.nextInt(); no != 0; no /= 10) {
			int digit = no % 10;
			int sum = 0;
			sum = sum + digit;

			if(sum > 9)
			{
				no = sum;
				sum = 0;
			}
			else {
				magic = sum;
			}
		}

		if(magic == 1)
		{
			System.out.println("Number is Magic");
		}
		else {
			System.out.println("Number is not a magic...");
		}
	}
}