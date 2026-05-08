import java.util.Scanner;
class StringPattern
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any String: ");
		String str = sc.nextLine();
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = i; j >= 0; j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}

		for(int i = str.length() - 2; i >= 0; i--)
		{
			for(int j = i; j >= 0; j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}