import java.util.Scanner;
class AddPreviousElement
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int x = arr[arr.length - 1];
		for(int i = arr.length - 1; i > 0; i--)
		{
			arr[i] = arr[i] + arr[i - 1];

			if(i == 1)
			{
				arr[i - 1] = arr[i - 1] + x;
			}
		}

		System.out.println("\nAfter add previous element in next");
		for(int ele: arr)
		{
			System.out.print(ele + " ");
		}
	}
}