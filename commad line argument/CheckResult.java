class CheckResult
{
	public static void main(String[] args) {
		if(args.length != 6)
		{
			System.out.println("Please Pass 6 subject marks");
			return;
		}

		try{
		int sub1,sub2,sub3,sub4,sub5,sub6,totalmarks;
		float per;
		sub1 = Integer.parseInt(args[0]);
		sub2 = Integer.parseInt(args[1]);
		sub3 = Integer.parseInt(args[2]);
		sub4 = Integer.parseInt(args[3]);
		sub5 = Integer.parseInt(args[4]);
		sub6 = Integer.parseInt(args[5]);

		totalmarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
		per = totalmarks / 6;


		System.out.println("Marks of Subject1 = " + sub1);
		System.out.println("Marks of Subject2 = " + sub2);
		System.out.println("Marks of Subject3 = " + sub3);
		System.out.println("Marks of Subject4 = " + sub4);
		System.out.println("Marks of Subject5 = " + sub5);
		System.out.println("Marks of Subject6 = " + sub6);

		System.out.println("\nTotal Marks = " + totalmarks);
		System.out.println("Persentage = " + per + "%");

		}catch(NumberFormatException e)
		{
			System.out.println("Please Pass only number");
		}
	}
}