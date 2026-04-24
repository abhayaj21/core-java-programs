import java.util.Scanner;
class SimpleInterest
{
	public static void main(String[] args) {

		int loanAmt,duration;
		float intrest,intrestAmt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Checke Simple Interest Here.....\n");
		System.out.print("Enter Loan Amount: ");
		loanAmt = sc.nextInt();
		System.out.print("Enter Interest Rate: ");
		intrest = sc.nextFloat();
		System.out.print("Enter Duration In Year: ");
		duration = sc.nextInt();

		intrestAmt = loanAmt * intrest / 100 * (duration * 12) / 12;

		System.out.println("SimpleInterest = " + intrestAmt);
	}
}