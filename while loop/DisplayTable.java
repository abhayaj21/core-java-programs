import java.util.Scanner;

class DisplayTable
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int no = sc.nextInt();
		int i = 1;
		while(i <= 10)
		{
			System.out.println(no + " x " + i + " = " + no * i);
			i++;
		}

	}
}