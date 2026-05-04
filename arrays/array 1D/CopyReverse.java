import java.util.Scanner;
class CopyReverse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int copy[] = new int[5];
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		int i,j;
		for(i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++,j--)
		{
			copy[i] = arr[j];
		}

		for(int ele: copy)
		{
			System.out.print(ele + " ");
		}
	}
}