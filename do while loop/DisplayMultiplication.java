import java.util.Scanner;

class DisplayMultiplication
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no1,no2,multi = 0;
		System.out.print("Enter First No: ");
		no1 = sc.nextInt();
		System.out.print("Enter Second No: ");
		no2 = sc.nextInt();

		if(no1 > no2)
		{
			do{
				multi = multi + no1;
				no2--;
			}while(no2 >= 1);
		}
		else {
			do{
				multi = multi + no2;
				no1--;
			}while(no1 >= 1);
		}

		System.out.println("Multiplication = " + multi);
	}
}