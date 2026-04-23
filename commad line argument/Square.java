class Square
{
	public static void main(String[] args) {

		if(args.length != 1)
		{
			System.out.println("Please Pass One Nubmer");
			return;
		}
		try{
		int n,square;
		n = Integer.parseInt(args[0]);
		square = n * n;
		System.out.println("Number = " + n);
		System.out.println("Square = " + square);
		}catch(Exception e)
		{
			System.out.println("Please Pass Only Number");
		}
	}
}