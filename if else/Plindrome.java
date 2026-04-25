import java.util.Scanner;

class Plindrome
{
	public static void main(String[] args) {
		
		int no,reverse,d1,d2,d3,saveNo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any 3 Digit Number: ");
		no = sc.nextInt();
		saveNo = no;

		d3 = no % 10;

		no = no / 10;
		d2 = no % 10;

		d1 = no / 10;

		reverse = (d3 * 100) + (d2 * 10) + d1;
		System.out.println(no);

		if(reverse == saveNo)
		{
			System.out.println("Number is Plindrome..");
		}
		else
		{
			System.out.println("Number is not Plindrome");
		}

	}
}