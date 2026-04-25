class CheckVowel
{
	public static void main(String[] args) throws Exception{
		
		char ch;
		System.out.print("Enter Any Character: ");
		ch = (char)System.in.read();

		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("It's Vowel");
		}
		else {
			System.out.println("It's Not a vowel..!");
		}

	}
}