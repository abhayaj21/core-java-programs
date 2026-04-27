import java.util.Scanner;
class DisplaySum1toN
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,sum;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		sum = 0;

		int i = 1;
		while(i <= no)
		{
			sum = sum + i;
			System.out.print(i + " + ");
			i++;
		}
		System.out.println("\b\b= " + sum);
	}
}