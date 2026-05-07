import java.util.Scanner;
class CountCapAlpha
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int cout = 0;
		System.out.print("Enter Any String: ");
		str = sc.nextLine();

		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				cout++;
			}
		}

		System.out.println("Capital Alphabate = " + cout);
	}
}