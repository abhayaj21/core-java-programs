import java.util.Scanner;
class SumOfCols
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]arr = new int[4][5];
		int[] sum = new int[arr[0].length];
		System.out.println("Enter 4 x 5 Matrix: ");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nSum of All columns");
		
			for(int j = 0; j < arr[0].length; j++)
			{
				for(int k = 0; k < arr.length; k++)
				{
					sum[j] = sum[j] + arr[k][j];
				}
		}

		for(int l = 0; l < arr.length; l++)
		{
			for(int p = 0; p < arr[l].length; p++)
			{
				System.out.print(arr[l][p] + " ");
			}
			System.out.println();
		}
		System.out.println("---------");

		for(int i = 0; i < sum.length; i++)
		{
			System.out.print(sum[i] + " ");
		}
	}
}