import java.util.Scanner;
class ReverseRow
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

		System.out.println("\nAfter Reversing Each Row");

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				int p,q;
				p = 0;
				q = arr[i].length - 1;
				while(p != q)
				{
				int temp = arr[i][p];
				arr[i][p] = arr[i][q];
				arr[i][q] = temp;
				p++;
				q--;
				}

				System.out.print(arr[i][j] + " ");
 			}
 			System.out.println();
		}
	}
}