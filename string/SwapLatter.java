import java.util.Scanner;
class SwapLatter
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any String: ");
		String str = sc.nextLine();

		char[] ch = str.toCharArray();
		char temp = ch[0];
		ch[0] = ch[ch.length-1];
		ch[ch.length-1] = temp;
		str = str.valueOf(ch);


		System.out.println("After Swaping");
		System.out.println(str);
	}
}