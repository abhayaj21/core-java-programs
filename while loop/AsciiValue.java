class AsciiValue
{
	public static void main(String[] args) {
		int no = 65;
		System.out.println("Alphabate\tAscii");
		while(no <= 90)
		{
			System.out.println((char)no + "\t\t " + no);
			no++;
		}
	}
}