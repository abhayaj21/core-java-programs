class Pattern50
{
	public static void main(String[] args) {
		for(int i = 1; i <= 7; i += 2)
		{
			for(int j = 7; j >= i; j--)
			{
				if(j == i)
					continue;
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				if(j == 1 || j == i)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}	
			}
			System.out.println();
		}

		for(int i = 1; i <= 7; i += 2)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 5; j >= i; j--)
			{
				if(j == 5 || j == i)
				{
					System.out.print(" 1");
				}
				else {
					System.out.print(" 0");
				}
			}
			System.out.println();
		}
	}
}