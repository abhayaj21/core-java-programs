import java.util.Scanner;
class ApplicationStatus
{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int age;
		char gender,marritalStatus;
		System.out.print("Enter Your Age: ");
		age = new Scanner(System.in).nextInt();

		System.out.print("Enter Your Marrital Status(Y/N): ");
		marritalStatus = (char)System.in.read();

		System.out.print("Enter Your Gender(M/F): ");
		gender = sc.next().charAt(0);


		if(age > 22 && (marritalStatus == 'Y' || marritalStatus == 'y'))
		{
			System.out.println("Your Are Eligible....");
		}
		else {
			if((gender == 'M' || gender == 'm') && age > 30)
			{
				System.out.println("Your Are Eligible....");
			}
			else if ((gender == 'F' || gender == 'f') && age > 25) {
				System.out.println("Your Are Eligible....");
			}
			else
			{
				System.out.println("Sorry! Your Not Eligible..");
			}
		}
	}
}