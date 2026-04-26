import java.util.Scanner;
class Display1toN
{
	public static void main(String[] args) {

		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		n = sc.nextInt();
		i = 1;
		while(i <= n)
		{
			System.out.println(i);
			i++;
		}
	}
}