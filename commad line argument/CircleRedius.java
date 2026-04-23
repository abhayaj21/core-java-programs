class CircleRedius
{
	static public void main(String[] args) {
		if(args.length != 1)
		{
			System.out.println("Please Pass One Number");
			return;
		}

		

		try{

			float redius,area,para;
			final float PI = 3.14f;
			redius = Integer.parseInt(args[0]);
			area = PI * redius * redius;
			para = 2 * PI * redius;

			System.out.println("Redius = " + redius);
			System.out.println("Area = " + area);
			System.out.println("Parameter = " + para);

		}catch(NumberFormatException e)
		{
			System.out.println("Please Enter Only Number");
		}
	}
}