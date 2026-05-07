import java.util.Scanner;
class DeclarationOfJagged
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]arr =  new int[3][3];
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[1];

		System.out.println("Enter Jagged Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("\nDisplay Jagged Array");
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