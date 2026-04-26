import java.util.Scanner;
class ArmstrongNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,sum,digit,saveNO;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		saveNO = no;
		sum = 0;

		while(no != 0)
		{
			digit = no % 10;
			sum = sum + digit * digit * digit;
			no = no / 10;
		}

		if(sum == saveNO)
		{
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number...!");
		}
	}
}