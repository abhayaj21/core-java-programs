import java.util.Scanner;
class CheckPalindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any String: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		char[] ch2 = new char[ch.length];
		String str2;
		for(int i = ch.length - 1,j = 0; i >= 0 && j < ch2.length; i--,j++)
		{
			ch2[j] = ch[i];
		}

		str2 = String.valueOf(ch2);

		if(str.equalsIgnoreCase(str2))
		{
			System.out.println("String is Palindrome");
		}
		else{
			System.out.println("String is not Palindrome");
		}
	}
}