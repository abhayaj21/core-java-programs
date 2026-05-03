class Pattern52
{
	public static void main(String[] args) {
		for(int i = 5; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				if(j == 5)
				{
					System.out.print(" ");
				}
				System.out.print("*");

				if(j == 5)
				{
					System.out.print(" ");
				}
			}
			for(int j = 5; j >= i; j--)
			{
				if(i==5)
					continue;
				System.out.print("  ");
			}
			for(int j = i; j >= 1; j--)
			{
				if(j == 5)
					continue;
				System.out.print("*");
			}
			System.out.println();
		}
	}
}