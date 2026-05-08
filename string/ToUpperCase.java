import java.util.Scanner;
class ToUpperCase
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any String: ");
		String str = sc.nextLine();

		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch >= 97 && ch <= 122)
			{
				ch = (char)(ch - 32);
			}
			System.out.print(ch);
		}
	}
}