class ShowChar
{
	public static void main(String[] args) throws Exception{
		System.out.print("Enter Any Character: ");
		int ch = System.in.read();

		System.out.println("Your Entered = " + (char)ch);
	}
}