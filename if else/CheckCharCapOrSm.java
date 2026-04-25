class CheckCharCapOrSm
{
	public static void main(String[] args) throws Exception{
		
		char ch;
		System.out.print("Enter Any Character: ");
		ch = (char)System.in.read();

		if(ch >= 65 && ch <= 90)
		{
			System.out.println("Capital Alphabate");
		}
		else if(ch >= 97 && ch <= 122)
		{
			System.out.println("Small Alphabate");
		}
		else if (ch >= 48 && ch <= 57) {
			System.out.println("It's A number..");
		}
		else
		{
			System.out.println("Not Character or Number it's spical Character");
		}
	}
}