import java.util.Scanner;

class DisplayPerfect1ToN
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,sum,i,x;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		i = 1;
		while (i <= no) {
			sum = 0;
			x = 1;
			while (x < i) {
				if(i % x == 0)
				{
					sum = sum + x;
				}
				x++;
			}

			if(sum == i)
			{
				System.out.println(i);
			}

			i++;
		}
	}
}