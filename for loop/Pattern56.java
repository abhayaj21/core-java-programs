class Pattern56
{
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(i == j  && j <= 3)
				{
					System.out.print("* ");
				}
				else if (j > 3 && 6 - i == j) {
					System.out.print("* ");
				}
				else if(i > 3 && j == 3) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}