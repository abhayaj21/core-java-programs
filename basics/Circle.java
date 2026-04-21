class Circle
{
	public static void main(String args[])
	{
		float area,para,redius;
		final float PI = 3.14f;
		redius = 5;
		area =  PI * (redius * redius);
		para = 2 * PI * redius;
		System.out.println("Redius Of A Circle = " + redius);
		System.out.println("Area = " + area);
		System.out.println("Parameter = " + para);
	}
}