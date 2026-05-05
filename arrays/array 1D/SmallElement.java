import java.util.Scanner;
class SmallElement
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int small = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] < small)
			{
				small = arr[i];
			}
		}

		System.out.println("Small Element = " + small);
	}
}