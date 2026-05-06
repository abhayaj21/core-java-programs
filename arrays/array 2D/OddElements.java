import java.util.Scanner;
class OddElements
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][5];
		System.out.println("Enter any 3 x 5 Matrix: ");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Odd Elements");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(arr[i][j] % 2 != 0)
				{
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
}