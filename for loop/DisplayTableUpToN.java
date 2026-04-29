import java.util.Scanner;

class DisplayTableUpToN
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.print("Enter No To Print Tables Upto: ");
		no = sc.nextInt();

		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.print("\n------------------------------------");
			System.out.println();
		}
	}
}