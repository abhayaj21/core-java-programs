class Pattern49
{
	public static void main(String[] args) {
		for(int i = 5; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				if(j == 5)
				{
					System.out.print(" " + j + "   ");
					continue;
				}
				System.out.print(j + " ");
			}
			for(int j = i + 1; j <= 5; j++)
			{
				
				System.out.print("    ");
			}
			for(int j = i; j >= 1; j--)
			{
				if(j == 5){
					System.out.print("\b");
					continue;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}