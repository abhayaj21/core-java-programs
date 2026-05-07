import java.util.Scanner;
class AlignAsending
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any String: ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();

		for(int i = 0; i < ch.length; i++)
		{
			for(int j = i + 1; j < ch.length; j++)
			{
				if(ch[i] > ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}

		str = String.valueOf(ch);
		System.out.println(str);
	}
}