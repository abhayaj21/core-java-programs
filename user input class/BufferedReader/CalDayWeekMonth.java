import java.io.*;

class CalDayWeekMonth
{
	public static void main(String[] args) throws Exception{
		
		int totalmoths,totalweeks,totaldays,years;
		final int MONTH = 12;
		final int WEEKS = 52;
		final int DAYS = 365;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Years: ");
		years = Integer.parseInt(br.readLine());
		totalmoths = MONTH * years;
		totalweeks = WEEKS * years;
		totaldays = DAYS * years;

		System.out.println("Years = " + years);
		System.out.println("Total Months = " + totalmoths);
		System.out.println("Total Weeks = " + totalweeks);
		System.out.println("Total Days = " + totaldays);
	}
}