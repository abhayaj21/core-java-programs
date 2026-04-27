import java.util.Scanner;
class FindHCF
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no1,no2,hcf,i;
		i = 2;
		hcf = 0;
		System.out.print("Eneter First No: ");
		no1 = sc.nextInt();
		System.out.print("Enter Second No: ");
		no2 = sc.nextInt();

		if(no1 > no2)
		{
			while(i < no1)
			{
				if(no1 % i == 0 && no2 % i == 0)
				{
					hcf = i;
				}
				i++;
			}
		}
		else
		{
			while(i < no2)
			{
				if(no1 % i == 0 && no2 % i == 0)
				{
					hcf = i;
				}
				i++;
			}
		}

		System.out.println("HFC = " + hcf);
	}
}