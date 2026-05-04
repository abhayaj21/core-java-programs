import java.util.Scanner;
class AllTypeSum
{
	public static void main(String[] args) {
		int allSum,eSum,oSum;
		allSum = eSum = oSum = 0;
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any 5 No: ");

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int ele: arr)
		{
			allSum = allSum + ele;
			if(ele % 2 == 0)
			{
				eSum = eSum + ele;
			}
			else
			{
				oSum = oSum + ele;
			}
		}

		System.out.println("\nAll Type Of Sum");
		System.out.println("Sum Of All Elements = " + allSum);
		System.out.println("Sum Of All Even Elements = " + eSum);
		System.out.println("Sum Of All Odd Elements = " + oSum);


	}
}