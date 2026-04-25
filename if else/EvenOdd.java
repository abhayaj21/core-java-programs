import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) {

		int no;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		no = sc.nextInt();

		if(no % 2 != 0)
		{
			System.out.println("Number is Odd");
		}
		else 
		{
			System.out.println("Number is Even");
		}

	}
}