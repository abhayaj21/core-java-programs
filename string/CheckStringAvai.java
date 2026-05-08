import java.util.Scanner;
class CheckStringAvai
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any String: ");
		String str = sc.nextLine();

		System.out.print("Search String: ");
		String search = sc.next();

		if(str.contains(search))
		{
			System.out.println("String is Availabel");
		}
		else{
			System.out.println("String is not Availabel");
		}
	}
}