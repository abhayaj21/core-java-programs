import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
class SimpleDateForamtDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Calendar c1 = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyy");
		Date d = new Date();
		System.out.println("Enter Birth Date to Retirment date");
		System.out.print("\nEnter Your Birth Date (dd-mm-yyyy): ");
		String date = sc.next();
		try{
		c1.setTime(sdf.parse(date));
		}catch(ParseException e)
		{
			e.printStackTrace();
		}
		c1.add(c1.YEAR,60);
		d = c1.getTime();
		System.out.println("Your Retirment Date = " + sdf.format(d));
	}
}