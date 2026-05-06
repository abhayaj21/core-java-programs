import java.util.Scanner;
class MaxElementOfCol
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

		System.out.println("Max Element");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-----------");
		System.out.print("Max = ");

			for(int j = 0; j < arr[0].length; j++)
			{
				int max = arr[0][j];
				for(int k = 0; k < arr.length; k++)
				{
					if(arr[k][j] > max)
					{
						max = arr[k][j];
					}

					// System.out.print(arr[k][j] + " ");
				}
				System.out.print(max + " ");
			}

	}
}