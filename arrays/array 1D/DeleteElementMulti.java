import java.util.Scanner;
import java.util.InputMismatchException;
class DeleteElementMulti
{
	public static void main(String[] args) 
	{
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int size = arr.length;
		int search;
		boolean isAvailable = false;

		try{
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("All Available Numbers");
		for(int ele: arr)
		{
			System.out.print(ele + " ");
		}

		do{

			System.out.print("\n\nEnter Number To Delete: ");
			search = sc.nextInt();

			for(int i = 0; i < size; i++)
			{
				if(arr[i] == search)
				{ 
					for(int j = i; j < size - 1; j++)
					{
						arr[j] = arr[j + 1];
					}
					size--;
					isAvailable = true;
					break;
				}
			}

			System.out.println("\nNo Deleted Successfully");

			if(isAvailable && size != 0){
			System.out.println("All Available No");
			for(int i = 0; i < size; i++)
			{
				System.out.print(arr[i] + " ");
			}
		}
		else {
			System.out.println("Number is Not Available");
		}

		}while(size != 0);

		System.out.println("All Numbers Are Deleted");
	}
	catch (InputMismatchException ex) { 
		System.out.println("Please Enter Only No!: " + ex.getMessage()); 
	}
	catch(Exception e)
	{
		System.out.println("Error: " + e.getMessage());
	}
 }

}