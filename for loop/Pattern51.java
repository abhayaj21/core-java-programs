class Pattern51
{
	public static void main(String[] args) {
		for(int i = 69; i >= 65; i--)
		{
			for(int j = 65; j <= i; j++)
			{
				if(j == 69){
					System.out.print(" " + (char)j);
					continue;
				}
				System.out.print((char)j);
			}
			for(int j = 69; j >= i; j--)
			{
				if(j == i)
					continue;
				System.out.print("  ");
			}
			for(int j = i; j >= 65; j--)
			{
				if(j == 69){
					System.out.print(" ");
					continue;
				}
				if(j == i)
					System.out.print(" ");
				System.out.print((char)j);
			}
			System.out.println();
		}

	}
}