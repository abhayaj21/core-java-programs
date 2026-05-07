import java.util.Scanner;
class CountVowel
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		int count = 0;
		System.out.print("Enter Any String: ");
		str = sc.nextLine();

		char[] arr = str.toCharArray();
		for(char ele: arr)
		{
			if(ele == 'a' || ele == 'e' || ele == 'i' || ele == 'o' || ele == 'u')
			{
				count++;
			}
		}

		System.out.println("Total Vowel in String = " + count);
	}
}