import java.util.Scanner;
class MaxElement
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

		System.out.println("After Finding Max Element Of each Row");

		for(int i = 0; i < arr.length; i++)
		{
			int max = arr[i][0];
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}
			}
			System.out.println("= Max = " + max);
		}
	}
}