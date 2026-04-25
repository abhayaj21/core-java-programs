class ChangeCharCase
{

	public void ConvertChar()
	throws Exception{
		char alphabate;
		System.out.print("Enter Any Case of Alphabate: ");
		alphabate = (char)System.in.read();
		if(alphabate >= 65 && alphabate <= 90)
		{
			alphabate = (char)(alphabate + 32);
			System.out.println("Converted = " + alphabate);
		}
		else if (alphabate >= 97 && alphabate <= 122) {
			alphabate = (char)(alphabate - 32);
			System.out.println("Converted = " + alphabate);
		}
		else
		{
			System.out.println("Please Enter Only Alphabate....");
			ConvertChar();
		}
	}

	public static void main(String[] args) throws Exception{

		ChangeCharCase ch = new ChangeCharCase();
		ch.ConvertChar();



	}
}