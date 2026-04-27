import java.util.Scanner;
class DisplayArm1ToN
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,sum,i,x,digit;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		i = 1;

		while(i <= no)
		{
			sum = 0;
			x = i;
			while(x != 0)
			{
				digit = x % 10;
				sum = sum + digit * digit * digit;
				x = x / 10;
			}

			if(sum == i)
			{
				System.out.println(i);
			}

			i++;
		}
	}
}