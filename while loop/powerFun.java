import java.util.Scanner;
class powerFun
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter No: ");
		int no = sc.nextInt();

		System.out.print("Enter Power: ");
		int pow = sc.nextInt();

		int res = power(no,pow);
		System.out.println("Result = " + res);
	}

	public static int power(int no,int pow)
	{
		int i = 1;
		int res = 1;

		while(i <= pow)
		{
			res = res * no;
			i++;
		}

		return res;
	}
}