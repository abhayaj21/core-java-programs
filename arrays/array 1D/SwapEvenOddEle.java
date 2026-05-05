import java.util.Scanner;
class SwapEvenOddEle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.print("Enter Any 6 No: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++)
		{
			if(i % 2 == 0)
			{
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		System.out.println("\nAfter Swap Even And Odd Elements");
		for(int ele: arr)
		{
			System.out.print(ele + " ");
		}
	}
}