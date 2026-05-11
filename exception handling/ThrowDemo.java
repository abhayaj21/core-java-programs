import java.util.Scanner;
class ThrowDemo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		int age =0;
		try{
			age = sc.nextInt();
		}
		catch (Exception e) {
			System.out.println("Wrong Input: " + e.getMessage());
		}

		if(age > 18)
		{
			System.out.println("Your Eligible for Voting");
		}
		else
		{
			throw new RuntimeException("Your Not Eligible for Voting");
		}
		System.out.println("Programs end");
	}
}