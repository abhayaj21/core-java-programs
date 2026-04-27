import java.util.Scanner;
class MagicNum
{
	public static void main(String[] args) {
		int no,digit,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No: ");
		no = sc.nextInt();

		while(no != 0)
		{
			digit = no % 10;
			sum = sum + digit;
			no = no / 10;
			if(no == 0 && sum > 9)
			{
				no = sum;
				sum = 0;
			}
		}

		if(sum == 1)
		{
			System.out.println("It's Magic Number...");
		}
		else {
			System.out.println("Not A Magic Number");
		}
	}
}