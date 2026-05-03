class Pattern54
{
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 5; j >= i; j--)
			{
				System.out.print("*");
			}
			for(int j = 1; j < i; j++)
			{
				System.out.print("  ");
			}
			System.out.print("\b");
			for(int j = 5; j >= i; j--)
			{
				System.out.print("*");
			}
			if(i == 5)
				break;
			System.out.println();
		}
		for(int i = 1; i <= 5; i++)
  	{
  		for(int j = 1; j <= i; j++)
  		{
  			if(i == 1)
  				continue;
  			System.out.print("*");
  		}
  		for(int j = 5; j > i; j--)
  		{
  			System.out.print("  ");
  		}
  		System.out.print("\b");
  		for(int j = 1; j <= i; j++)
  		{
  			if(i == 1)
  				continue;
  			System.out.print("*");
  		}

  		System.out.println();
  	}
	}
}