import java.util.Scanner;
class SwapFirstLastElements
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("Enter Any 5 Array Elements: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		int saveVal = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = saveVal;
		System.out.println("\nAfter The Swaping 1 And Last Element");

		for(int ele: arr)
		{
			System.out.print(ele + " ");
		}
	}
}