import java.util.Scanner;
class ReverseNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,reverse,mod;
		reverse = 0;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();

		while(no != 0)
		{
			mod = no % 10;
			reverse = reverse * 10 + mod;
			no /= 10; 
		}

		System.out.println("Reverse No = " + reverse);
	}
}