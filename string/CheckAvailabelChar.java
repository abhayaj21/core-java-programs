import java.util.Scanner;
class CheckAvailabelChar
{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.print("Enter Any String: ");
		String str = sc.nextLine();

		System.out.print("\nEnter To Search Char: ");
		ch = (char)System.in.read();

		if(str.indexOf(ch) >= 0)
		{
			System.out.println("Charcter is Availabel");
		}
		else{
			System.out.println("Charcter is Not Availabel");
		}
	}
}