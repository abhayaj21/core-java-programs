import java.util.Scanner;
class SumEven
{
	public static void main(String[] args) {
		
		int no,i,sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		no = sc.nextInt();
		i = 1;
		sum = 0;

		while(i <= no)
		{
			if(i % 2 == 0)
			{
				sum = sum + i;
				System.out.print(i + " + ");
			}
			i++;
		}

		System.out.println("\b\b= " + sum);
	}
}