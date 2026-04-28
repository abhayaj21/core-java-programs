class ShowLeapYear
{
	public static void main(String[] args) {
		System.out.println("This All Leap Year From 2000 to 2050\n");
		int year = 2000;
		while(year <= 2050)
		{
			if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			{
				System.out.println(year);
			}

			year++;
		}
	}
}