import java.util.Scanner;
class SortColAssending
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][5];
		System.out.println("Enter 4 x 5 Matrix: ");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("After Sort Assending In Columns");
		for(int i = 0; i < arr[0].length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				for(int k = j + 1; k < arr.length; k++)
				{
					if(arr[j][i] > arr[k][i])
					{
						int temp = arr[j][i];
						arr[j][i] = arr[k][i];
						arr[k][i] = temp;
					}
				}
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}