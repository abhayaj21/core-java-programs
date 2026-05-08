import java.util.Scanner;
class ReverseWord
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any String: ");
		String str = sc.nextLine();

		String[] str2 = str.split(" ");
		for(int i = 0; i < str2.length; i++)
		{
			String temp = str2[i];
			String str3 = "";
			for(int j = temp.length() - 1; j >= 0; j--)
			{
				str3 = str3 + temp.charAt(j);
			}

			System.out.print(str3 + " ");
		}
	}
}