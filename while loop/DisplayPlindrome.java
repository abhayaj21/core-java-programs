class DisplayPlindrome
{
	public static void main(String[] args) {
		int no,rev,digit,saveNO;
		no = 200;
		rev = 0;
		digit = 0;
		saveNO = 0;
		System.out.println("Plindrome Number Btweeen 200 To 300");

		while(no <= 300)
		{
			rev = 0;
			saveNO = no;

			while(saveNO != 0)
			{
				digit = saveNO % 10;
				rev = rev * 10 + digit;
				saveNO = saveNO / 10;
			}

			if(rev == no)
				System.out.println(no);

			no++;
		}

	}
}