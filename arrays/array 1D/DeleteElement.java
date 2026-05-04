import java.util.Scanner;
class DeleteElement
{
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int search;
		int length = arr.length;
		boolean isAvailable = false;

		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < length; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("All Numbers");
		for(int ele: arr)
		{
			System.out.print(ele + " ");
		}

		System.out.print("\n\nEnter No To Delete: ");
		search = sc.nextInt();
		

		for(int i = 0; i < length; i++)
		{
			if(arr[i] == search)
			{
				int j;
				for(j = i; j < length - 1; j++)
				{
					arr[j] = arr[j + 1];
				}
				length--;
				isAvailable = true;
				break;
			}
		}

		if(isAvailable)
		{
			System.out.println("No Deleted Successfully");
			System.out.println("\nAfter deleting");
			for(int ele = 0; ele < length; ele++)
			{
				System.out.print(arr[ele] + " ");
			}
		}
		else{
			System.out.println("No is not Available");
		}
	}
}