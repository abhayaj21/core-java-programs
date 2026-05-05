import java.util.Scanner;
class SearchNum
{
	public static void main(String[] args) {
		int[] arr = new int[5];
		int search;
		boolean isFind = false;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any 5 No: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.print("\nSearch Number: ");
		search = sc.nextInt();

		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == search)
			{
				isFind = true;
				break;
			}
		}

		if(isFind)
		{
			System.out.println("Number is Available");
		}
		else
		{
			System.out.println("Number is Not Available");
		}

	}
}