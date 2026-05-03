class Pattern40
{
	public static void main(String[] args) {
		for(int i = 7; i >= 1; i -= 2)
		{
			for(int j = 7; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}