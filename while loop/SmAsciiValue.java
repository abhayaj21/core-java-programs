class SmAsciiValue
{
	public static void main(String[] args) {
		int no = 97;
		System.out.println("Alphabate\tAscii");
		while(no <= 122)
		{
			System.out.println((char)no + "\t\t " + no);
			no++;
		}
	}
}