import java.util.Scanner;
class RowSumOfMatrix
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]arr = new int[3][5];
		int sum = 0;
		System.out.println("Enter 3 x 5 Matrix: ");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nSum of all row");
		for(int i = 0; i < arr.length; i++)
		{
			sum = 0;
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
			}
			System.out.println("= " + sum);
		}
	}
}