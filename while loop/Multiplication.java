import java.util.Scanner;

class Multiplication
{
	public static void main(String[] args) {
		int no1,no2,mul;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		no1 = sc.nextInt();
		System.out.print("Enter second Number: ");
		no2 = sc.nextInt();
		mul = 0;

		if(no1 > no2)
		{
			while(no2 != 0)
			{
				mul = mul + no1;
				no2--;
			}
		}
		else
		{
			while(no1 != 0)
			{
				mul = mul + no2;
				no1--;
			}
		}

		System.out.println("Multiplication = " + mul);
	}
}






//second logic

/*

no1 = 5; no2 = 4;
mul = 0 a = 0;

if(no1 > no2)

{
	while(a <= no2)
	{
	   mul = mul + no1;
	   a++;
	}
}
else{
	while(a <= no1)
	{
	   mul = mul + no2;
	   a++;
	}
}

*/