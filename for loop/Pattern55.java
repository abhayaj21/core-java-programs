class Pattern55
{
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(j == i)
				{
					System.out.print("* ");
					continue;
				}
				if(6 - i == j)
				{
					System.out.print("* ");
					continue;
				}
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}