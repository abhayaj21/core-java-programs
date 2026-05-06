class InitilizeArray
{
	public static void main(String[] args) {
		int arr[][] = {{23,43,54,56,21},
					   {89,65,12,73,49},
					   {54,12,90,24,28}};

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