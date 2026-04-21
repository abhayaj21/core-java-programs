class DaimeterRedius
{
	public static void main(String[] args) {
		float redius,diameter;
		final float PI = 3.14f;
		int area = 100;

		redius = area / PI;
		redius = (float)Math.sqrt(redius);
		diameter = 2 * redius;

		System.out.println("Area = " + area);
		System.out.println("Redius = " + redius);
		System.out.println("Daimeter = " + diameter);

	}
}
