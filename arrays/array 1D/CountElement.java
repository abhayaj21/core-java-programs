import java.util.Scanner;
class CountElement
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int[] visited = new int[5];
		int count = 1;
		boolean isAvailabel = false;
		System.out.print("Enter Any 5 No: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < arr.length; i++)
		{
			count = 1;
			for(int k = 0; k < i; k++)
			{
				if(arr[k] == arr[i])
				{
					isAvailabel = true;
				}
				else{

					for(int j = i + 1; j < arr.length; j++)
				{
						if(arr[i] == arr[j])
						{
							count++;
						}	
				}
			}
		}
			if(isAvailabel)
				continue;
			System.out.println(arr[i] + " = " + count);
		}

}//main method

}//class