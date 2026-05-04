import java.util.Scanner;
class DisplayArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("Enter Array of size 5: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println();
		for(int value: arr)
		{
			System.out.print(value + " ");
		}

	}
}