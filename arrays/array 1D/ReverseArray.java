import java.util.Scanner;
class ReverseArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0,j = arr.length - 1; i < arr.length; i++,j--)
		{
			if(i == j)
				break;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.println("\nAfter Reversing Array");
		for(int ele: arr)
		{
			System.out.print(ele + " ");
		}
	}
}