import java.util.Scanner;

class AgeCal
{
	public static void main(String[] args) {

		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age: ");
		age = sc.nextInt();

		if(age <= 13)
		{
			System.out.println("Your A Child");
		}
		else if(age <= 20)
		{
			System.out.println("Your Teen");
		}
		else if(age <= 60)
		{
			System.out.println("Your Adult");
		}
		else
		{
			System.out.println("Your Senior");
		}
	}
}