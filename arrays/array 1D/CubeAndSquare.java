import java.util.Scanner;
class CubeAndSquare
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Square of Array Elements");
		for(int i = 0; i < arr.length; i++)
		{
			int square = arr[i] * arr[i];
			System.out.print(square + " ");
		}

		System.out.println("\nCube of Array Elements");
		for(int i = 0; i < arr.length; i++)
		{
			int cube = arr[i] * arr[i] * arr[i];
			System.out.print(cube + " ");
		}
	}
}