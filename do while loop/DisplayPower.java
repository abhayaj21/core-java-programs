import java.util.Scanner;
class DisplayPower
{
	public static void main(String[] args) {
		int n,x,pow = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No: ");
		n = sc.nextInt();
		System.out.print("Enter Power: ");
		x = sc.nextInt();

		do{

			pow = pow * n;
			x--;

		}while(x > 0);


		System.out.println("Power = " + pow);

	}
}