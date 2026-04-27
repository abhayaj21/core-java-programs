import java.util.Scanner;
class DisplayMagic
{
	public static void main(String[] args) {
		int no,i,sum,digit,x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		i = 1;
		while (i <= no) {
			sum = 0;
			x = i;

			while (x != 0) {
				digit = x % 10;
				sum = sum + digit;
				x = x / 10;
				if(sum > 9)
				{
					x = sum;
					sum = 0;
				}
			}

			if(sum == 1)
			{
				System.out.println(i);
			}

			i++;
		}

	}
}