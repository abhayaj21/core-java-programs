import java.util.Scanner;
class GretestOfThree
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no1,no2,no3;

		System.out.print("Check Gretest Number....\n");
		System.out.print("Enter First Number: ");
		no1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
		no2 = sc.nextInt();
		System.out.print("Enter Third Number: ");
		no3 = sc.nextInt();

		if(no1 != no2)
		{
		if(no1 > no2 && no1 > no3)
		{
			System.out.println("Max No = " + no1);
		}
		else if(no2 > no1 && no2 > no3)
		{
			System.out.println("Max No = " + no2);
		}
		else 
		{
			System.out.println("Max No = " + no3);
		}
	}
	else{
		if(no3 > no1)
		{
			System.out.println("Max No = " + no3);
		}
		else
		{
			System.out.println("Max No = " + no1);
		}
	}
	}
}