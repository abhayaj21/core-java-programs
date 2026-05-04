import java.util.Scanner;
class EvenElements
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("\nEven Elements");
		for(int ele: arr)
		{
			if(ele % 2 == 0)
			{
				System.out.print(ele + " ");
			}
		}
	}
}