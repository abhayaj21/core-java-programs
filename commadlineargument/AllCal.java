class AllCal
{
	public static void main(String[] args) {
		if(args.length != 2)
		{
			System.out.println("Please Pass Two Number");
			return;
		}

		try{

			int no1,no2,cal;

			no1 = Integer.parseInt(args[0]);
			no2 = Integer.parseInt(args[1]);


			System.out.println("Number 1 = " + no1);
			System.out.println("Number 2 = " + no2);

			cal = no1 + no2;
			System.out.println("Addition = " + cal);

			cal = no1 - no2;

			System.out.println("Substraction = " + cal);

			cal = no1 * no2;

			System.out.println("Multiplication = " + cal);

			cal = no1 / no2;

			System.out.println("Division = " + cal);
		}catch(NumberFormatException e)
		{
			System.out.println("Please Enter Only Number");
		}
	}
}