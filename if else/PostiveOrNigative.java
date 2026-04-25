import java.util.Scanner;
class PostiveOrNigative
{
	public static void main(String[] args) {
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		no = sc.nextInt();

		if(no > 0)
		{
			System.out.println("Number is Positive");
		}
		else if(no < 0)
		{
			System.out.println("Number is Nagative");
		}
		else
		{
			System.out.println("Number is Zero");
		}

	}
}