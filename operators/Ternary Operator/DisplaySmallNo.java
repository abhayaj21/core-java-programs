import java.util.Scanner;
class DisplaySmallNo
{
	public static void main(String args[])
	{
		int no1,no2,small;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter No1: ");
		no1 = in.nextInt();
		System.out.print("Enter No2: ");
		no2 = in.nextInt();

		small = (no1 < no2) ? no1 : no2;

		System.out.println("Small No = " + small);
	}
}