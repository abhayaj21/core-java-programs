import java.util.Scanner;
class SortRowInAssending
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][5];
		System.out.println("Enter 3 x 5 Matrix: ");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nAfter Sorting in Asseding Order of Row");

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				for(int k = j + 1; k < arr[i].length; k++)
				{
					if(arr[i][j] > arr[i][k])
					{
						int temp = arr[i][k];
						arr[i][k] = arr[i][j];
						arr[i][j] = temp;
					}
				}

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}