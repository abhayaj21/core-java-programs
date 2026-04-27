class DisplayPrime
{
	public static void main(String[] args) {
		int no,i;
		no = 1;

		while(no <= 100)
		{
			saveNo = no;
			i = 2;
			
			while (i < no) {

				if(no % i == 0)
				{
					break;
				}
				i++;
			}
			if(i == no)
			{
			System.out.println(i);				
			}
			no++;
		}
	}
}