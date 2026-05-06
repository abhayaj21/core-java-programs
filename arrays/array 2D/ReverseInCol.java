import java.util.Scanner;
class ReverseInCol
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][4];
		System.out.println("Enter 5 x 4 Matrix: ");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nAfter Revesing in Columns");
		for(int i = 0; i < arr[0].length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				int p,q;
				p = 0;
				q = arr.length - 1;
				while(p != q)
				{
					int temp = arr[p][i];
					arr[p][i] = arr[q][i];
					arr[q][i] = temp;
					p++;
					q--;
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