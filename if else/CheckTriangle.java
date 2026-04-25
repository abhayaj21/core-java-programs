import java.util.Scanner;
class CheckTriangle
{
	public static void main(String[] args) {

		int angle1,angle2,angle3,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Check Triangle is Valid or Not\n");

		System.out.print("Enter Angle 1: ");
		angle1 = sc.nextInt();
		System.out.print("Enter Angle 2: ");
		angle2 = sc.nextInt();
		System.out.print("Enter Angle 3: ");
		angle3 = sc.nextInt();

		sum = angle1 + angle2 + angle3;

		if(sum == 180)
		{
			System.out.println("It's Valid Triangle...");
		}
		else
		{
			System.out.println("Not A Triangle..");
		}
	}
}