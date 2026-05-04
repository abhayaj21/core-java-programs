class InitilizeArray
{
	public static void main(String[] args) {
		// int arr[];
		int arr[] = {23,54,32,64,76};
		// for(int i = 0; i < arr.length; i++)
		// {
		// 	System.out.println(arr[i]);
		// }

		for(int value: arr)
		{
			System.out.println(value);
		}
	}
}