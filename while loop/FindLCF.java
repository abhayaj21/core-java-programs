import java.util.Scanner;
class FindLCF
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no1,no2,i,lcf = 0;
		System.out.print("Enter First No: ");
		no1 = sc.nextInt();
		System.out.print("Enter Second No: ");
		no2 = sc.nextInt();

		if(no1 > no2)
		{
			i = no1;
			while(i > 1)
			{
				if(no1 % i == 0 && no2 % i == 0)
				{
					lcf = i;
				}
				i--;
			}
		}
		else
		{
		i = no2;
			while(i > 1)
			{
				if(no1 % i == 0 && no2 % i == 0)
				{
					lcf = i;
				}
				i--;
			}	
		}

		System.out.println("LCF = " + lcf);
	}
}