import java.util.Scanner;
class DisplayNto1
{
	public static void main(String[] args) {
		
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		n = sc.nextInt();

		while(n >= 1)
		{
			System.out.println(n);
			n--;
		}
	}
}