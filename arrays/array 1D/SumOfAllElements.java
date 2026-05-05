import java.util.Scanner;
class SumOfAllElements
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum[] = new int[5];
		int sumOfEle = 0;
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < sum.length; i++)
		{
			sum[i] = sc.nextInt();
		}

		System.out.println("\nSum Of All Elements");
		for(int ele: sum)
		{
			sumOfEle = sumOfEle + ele;
		}
		System.out.println("Sum = " + sumOfEle);
	}
}