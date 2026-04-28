class Reciprocal
{
	public static void main(String[] args) {
		int no;
		float reci;
		no = 1;
		System.out.println("Number\t\tReciprocal");
		while(no <= 10)
		{
			reci = (float)1 / no;
			System.out.println(no + "\t\t" + reci);
			no++;
		}
	}
}