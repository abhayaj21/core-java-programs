import java.util.Scanner;
class MultipliOfTwoMatrix
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]arr1 = new int[3][3];
		int[][]arr2 = new int[3][3];
		int[][]multi = new int[3][3];

		System.out.println("Enter 3 x 3 First Matrix: ");
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr1[i].length; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter 3 x 3 Second Matrix: ");
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = 0; j < arr2[i].length; j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}

		System.out.println("Multiplication of two Matrix: ");
		for(int i = 0; i < multi.length; i++)
		{
			for(int j = 0; j < multi[i].length; j++)
			{
				multi[i][j] = arr1[i][j] * arr2[i][j];
				System.out.print(multi[i][j] + " ");
			}
			System.out.println();
		}

	}
}