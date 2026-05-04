import java.util.Scanner;
class AddNextElement
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		int x = arr[0];

		for(int i = 0; i < arr.length - 1; i++)
		{
			arr[i] = arr[i] + arr[i + 1];
			if(i == 3)
			{
				arr[i + 1] = arr[i + 1] + x;
			}
		}

		System.out.println("\nAfter Adding next element inoto previous");

		for(int ele: arr)
		{
			System.out.print(ele + " ");
		}
	}
}