import java.util.Scanner;
class RemoveDuplicate
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int size = arr.length;
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < size; i++)
		{
			for(int j = i + 1; j < size; j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j] = 0;
				}
			}
		}


		for(int i = 0; i < size; i++)
		{
			if(arr[i] == 0)
			{
				for(int j = i + 1; j < size; j++)
				{
					arr[i] = arr[j];
				}
				size--;
				i--;
			}
		}

		System.out.println("\nAfter Removing Duplicate Element");
		for(int ele = 0; ele < size; ele++)
		{
			// if(arr[ele] != -1)
			System.out.print(arr[ele] + " ");
		}
	}
}