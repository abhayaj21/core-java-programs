import java.util.Scanner;
class EncryptString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str,str2 = "";
		int vowel = 0;
		System.out.print("Enter Any String: ");
		str = sc.nextLine();

		for(int i = str.length() - 1; i >= 0; i--)
		{
			char ch = str.charAt(i);
			if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
			{
				vowel++;
			}
			str2 = str2 + ch;
		}

		String str3 = "";

		for(int i = 0; i < str2.length(); i++)
		{
			char ch = str2.charAt(i);
			if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
			{
				str3 = str3+ vowel;
				vowel--;
			}
			else{
				str3 = str3 + ch;
			}
		}

		System.out.println("Result = " + str3);
	}
}