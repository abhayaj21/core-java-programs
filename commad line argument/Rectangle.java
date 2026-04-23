class Rectangle
{
	public static void main(String[] args) {
		if(args.length != 2)
		{
			System.out.println("Please Pass Two Number");
			System.exit(0);
		}

		try{

			int len,wid,area,para;
			len = Integer.parseInt(args[0]);
			wid = Integer.parseInt(args[0]);
			area = len * wid;
			para = 2 * (len + wid);

			System.out.println("Length = " + len);
			System.out.println("Width = " + wid);
			System.out.println("Area = " + area);
			System.out.println("Parameter = " + para);
		}catch(NumberFormatException ex)
		{
			System.out.println("Please Enter Only Number");
		}
	}
}