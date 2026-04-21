class SwapStore
{
	public static void main(String[] args) {
		int no1,no2,temp;
		no1 = 14;
		no2 = 8;

		System.out.println("Before Swap ");
		System.out.println("No1 = " + no1);
		System.out.println("No2 = " + no2);


		
		System.out.println("\nAfter Swap ");

		temp = no1;
		no1 = no2;
		no2 = temp;

		System.out.println("No1 = " + no1);
		System.out.println("No2 = " + no2);
	}
}