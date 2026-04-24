class SmallToCap
{
	public static void main(String[] args) throws Exception{
		
		char sml,cap;
		System.out.print("Enter Any Small Alphabate: ");
		sml = (char)System.in.read();
		cap = (char)(sml - 32);
		System.out.println("Capital Alphabate = " + cap);

	}
}