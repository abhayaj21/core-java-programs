import java.util.Scanner;
class SmallNo
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int no1,no2,no3;
		System.out.print("Enter Number 1: ");
		no1 = sc.nextInt();

		System.out.print("Enter Number 1: ");
		no2 = sc.nextInt();

		System.out.print("Enter Number 1: ");
		no3 = sc.nextInt();

		if(no1 != no2)
		{
		if(no1 < no2 && no1 < no3)
		{
			System.out.println("Small No = " + no1);
		}
		else if(no2 < no1 && no2 < no3)
		{
			System.out.println("Small No = " + no2);
		}
		else
		{
			System.out.println("Small No = " + no3);	
		}
	}
	else 
	{
		if(no1 < no3)
		{
			System.out.println("Small No = " + no1);
		}
		else
		{
			System.out.println("Small No = " + no3);
		}
	}
	}
}