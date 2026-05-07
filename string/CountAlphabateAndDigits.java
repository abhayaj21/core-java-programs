import java.util.Scanner;
class CountAlphabateAndDigits
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit,smAlpha,capAlpha;
		digit = smAlpha = capAlpha = 0;
		System.out.print("Enter Any String: ");
		String str = sc.nextLine();

		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				capAlpha++;
			}
			else if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				smAlpha++;
			}
			else if(str.charAt(i) >= 47 && str.charAt(i) <= 57)
			{
				digit++;
			}
		}

		System.out.println("Total Capital Alphabate = " + capAlpha);
		System.out.println("Total Small Alphabate = " + smAlpha);
		System.out.println("Total Digits = " + digit);

	}
}