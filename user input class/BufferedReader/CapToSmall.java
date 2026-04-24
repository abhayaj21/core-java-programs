class CapToSmall
{
	public static void main(String[] args) throws Exception{
		char cap,small;
		System.out.print("Enter Any Capital Alphabate: ");
		cap = (char)System.in.read();
		small = (char)(cap + 32);
		System.out.println("Small Alphabate = " + small);
	}
}