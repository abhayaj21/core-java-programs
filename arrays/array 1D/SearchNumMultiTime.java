import java.util.Scanner;
class SearchNumMultiTime
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int search;
		boolean isFind = false;
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		do{
			System.out.print("Search your No: ");
			search = sc.nextInt();

			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i] == search)
				{
					isFind = true;
					break;
				}
			}

			if(!isFind)
			{
				System.out.println("Not Available");
			}

		}while(!isFind);

		if(isFind)
		{
			System.out.println("Number is Available");
		}
		
	}
}