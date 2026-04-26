import java.util.Scanner;
class CheckPerfectNo
{
	public static void main(String[] args) {
		
		int no,i,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		i = 1;

		while(i < no)
		{
			if(no % i == 0)
			{
				sum = sum + i;
			}
			i++;
		}

		if(sum == no)
		{
			System.out.println("It's Perfect No");
		}
		else 
		{
			System.out.println("It's Not A Perfect No");
		}
	}
}