class NoAsciiValue
{
	public static void main(String[] args) {
		int no = 48;
		System.out.println("Alphabate\tAscii");
		while(no <= 57)
		{
			System.out.println((char)no + "\t\t " + no);
			no++;
		}
	}
}