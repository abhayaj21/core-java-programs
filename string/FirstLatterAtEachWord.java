import java.util.Scanner;
class FirstLatterAtEachWord
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any String: ");
		String str = sc.nextLine();
		String[] str2 = str.split(" ");
		for(int i = 0; i < str2.length; i++)
		{
			System.out.print(str2[i].charAt(0));
		}
	}
}