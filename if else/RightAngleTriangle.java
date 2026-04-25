import java.util.Scanner;

class RightAngleTriangle
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int angle1,angle2,angle3,sum;
		System.out.print("Enter First Angle of Triangle: ");
		angle1 = sc.nextInt();
		System.out.print("Enter Second Angle of Triangle: ");
		angle2 = sc.nextInt();
		System.out.print("Enter Third Angle of Triangle: ");
		angle3 = sc.nextInt();

		sum = angle1 + angle2 + angle3;

		if(sum == 180)
		{
			System.out.println("It's Valid Triangle..\n");
			if(angle1 == 90 || angle2 == 90 || angle3 == 90)
			{
				System.out.println("It's Right Angle Triangle");
			}
			else
			{
				System.out.println("It's Not a Right Angle Triangle");
			}
		}
		else
		{
			System.out.println("Not Valid Triangle");
		}
	}
}