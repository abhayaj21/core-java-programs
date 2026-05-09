import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.Month;
class CheckAgeDemo
{
	public static void main(String args[])throws Exception{
		Date d1 = new Date();
		Date d2 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Birth Date(dd-mm-yyyy): ");
		String date = sc.next();
		
		d2 = sdf.parse(date);
		
		Calendar inDate = Calendar.getInstance();
		inDate.setTime(d2);
		int day = inDate.get(Calendar.DAY_OF_MONTH);
		int month = inDate.get(Calendar.MONTH) + 1;
		int year = inDate.get(Calendar.YEAR);
		
		LocalDate startDate = LocalDate.of(year,month,day);
		
		LocalDate endDate = LocalDate.now();
		
		Period p = Period.between(startDate,endDate);
		
		System.out.println("Years = " + p.getYears() + "\nMoths = " + p.getMonths() + "\nDays = " + p.getDays());
		
	}
}