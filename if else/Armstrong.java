import java.util.Scanner;
	
class Armstrong
{
	public static void main(String[] args) {
		
		int num,SaveNo,d1,d2,d3,sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Three Digit Number: ");
		num = sc.nextInt();
		SaveNo = num;

		d3 = num % 10;
		num = num / 10;
		d2 = num % 10;

		d1 = num / 10;

		sum = ((int)Math.pow(d1,3)) + ((int)Math.pow(d2,3)) + ((int)Math.pow(d3,3));

		if(sum == SaveNo)
		{
			System.out.println("Number is Armstrong..");
		}
		else
		{
			System.out.println("Number is not a Armstrong");
		}
	}
}