import java.util.Scanner;
class CheckGrade
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float per;
		System.out.print("Enter Your Persentage: ");
		per = sc.nextFloat();

		if(per >= 90)
		{
			System.out.println("Grade = A");
		}
		else if(per >= 75)
		{
			System.out.println("Grade = B");
		}
		else if(per >= 60)
		{
			System.out.println("Grade = C");
		}
		else if(per >= 30)
		{
			System.out.println("Grade = D");
		}
		else
		{
			System.out.println("Grade = F");
		}
	}
}