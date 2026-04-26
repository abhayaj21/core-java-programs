import java.util.Scanner;
class CheckPrime
{
	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		int i = 2;
		boolean isPrime = true;

		while(i < no)
		{
			if(no % i == 0)
			{
				isPrime = false;
				break;
			}
			i++;
		}

		if(isPrime)
		{
			System.out.println("prime");
		}
		else{
			System.out.println("Not prime");
		}
	}
}