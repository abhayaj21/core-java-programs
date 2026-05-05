import java.util.Scanner;
class OddElements
{
	public static void main(String[] args) {
		int odd[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < odd.length; i++)
		{ 
			odd[i] = sc.nextInt();
		}
		System.out.println("\nOdd Elements");
		for(int ele: odd)
		{
			if(ele % 2 != 0)
			{
				System.out.print(ele + " ");
			}
		}
	}
}