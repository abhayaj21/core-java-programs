class Circle
{
	public static void main(String[] args) {
		
		float redius,area,para;
		final float PI = 3.14f;

		redius = 1;
		System.out.println("Redius\t\tArea\t\t\tParameter");
		while(redius <= 10)
		{
			area = PI * redius * redius;
			para = 2 * PI * redius;
			System.out.println(redius + "\t\t" + area + "\t\t\t" + para);
			redius++;

		}
	}
}