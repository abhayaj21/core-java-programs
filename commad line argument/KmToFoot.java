class KmToFoot
{
	public static void main(String[] args) {
		if(args.length != 1)
		{
			System.out.println("Please Pass One Number....");
			return;
		}

		try
		{
			int km,meter;
			float foot;

			km = Integer.parseInt(args[0]);
			meter = 1000 * km;
			foot = (float)meter * (float)3.31;

			System.out.println("KM = " + km);
			System.out.println("Meter = " + meter);
			System.out.println("Foot = " + foot);
		}catch(NumberFormatException ex)
		{
			System.out.println("Enter Only Number Please...");
		}
	}
}