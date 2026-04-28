import java.util.Scanner;
class PlindromeNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,saveNo,mod,reverse;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		saveNo = no;
		reverse = 0;

		while(no != 0)
		{
			mod = no % 10;
			reverse = reverse * 10 + mod;
			no = no / 10;
		}

		if(saveNo == reverse)
		{
			System.out.println("It's Plindrome No...");
		}
		else
		{
			System.out.println("It's Not Plindrome....");
		}
	}
}