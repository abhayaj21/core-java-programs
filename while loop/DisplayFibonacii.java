import java.util.Scanner;
class DisplayFibonacii
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,i,firstTearm,secondTearm,sum;
		firstTearm = 0;
		secondTearm = 1;
		i = 1;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		while (i <= no) {
			System.out.println(firstTearm);

			sum = firstTearm + secondTearm;

			firstTearm = secondTearm;
			secondTearm = sum;
			i++;

		}

	}
}