class FraheniteToCelcius
{
	public static void main(String[] args) {

		if(args.length != 1)
		{
			System.out.println("Please pass One Number....");
			return;
		}

		try{
		int frahenite,celcius;
		frahenite = Integer.parseInt(args[0]);
		celcius = (frahenite - 32) * 5 / 9;

		System.out.println("Frahenite = " + frahenite);
		System.out.println("celcius = " + celcius);

		}catch(NumberFormatException nf)
		{
			System.out.println("Enter Only Number");
		}
	}
	
}