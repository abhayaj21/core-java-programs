class Ascii
{
	public static void main(String[] args) throws Exception{
		char ch; 
		System.out.print("Enter Any Number: ");
		ch = (char)System.in.read();
		int no = ch;

		System.out.println("Ascii Value = " + no);		
	}
}