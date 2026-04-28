import java.util.Scanner;

class SumOfAll
{
	public static void main(String[] args) {
		int no,i,sumAll,sumEven,sumOdd;
		Scanner sc = new Scanner(System.in);
		sumAll = sumEven = sumOdd = 0;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		i = 1;
		while(i <= no)
		{
			if(i % 2 == 0)
			{
				sumEven = sumEven + i;
			}

			else{
				sumOdd = sumOdd + i;
			}

			sumAll = sumAll + i;
			i++;
		}

		System.out.println("Sum Of All   = " + sumAll);
		System.out.println("Sum Of Even  = " + sumEven);
		System.out.println("Sum of Odd   = " + sumOdd);
	}
}