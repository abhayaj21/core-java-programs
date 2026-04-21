class SwapStoreNo
{
	public static void main(String[] args) {
		int no1,no2;
		no1 = 98;
		no2 = 65;
		System.out.println("Before Swap");
		System.out.println("No1 = " + no1);
		System.out.println("No2 = " + no2);

		no1 = no1 + no2;//22
		no2 = no1 - no2;//14
		no1 = no1 - no2;//8

		System.out.println("\nAfter Swap");
		System.out.println("No1 = " + no1);
		System.out.println("No2 = " + no2);
	}
}