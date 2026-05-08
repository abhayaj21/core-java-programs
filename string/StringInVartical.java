import java.util.Scanner;
class StringInVartical
{
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any String: ");
		str = sc.nextLine();

		char[] arr = str.toCharArray();

		for(char ele: arr)
		{
			System.out.println(ele);
		}
	}
}