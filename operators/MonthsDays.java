import java.util.Scanner;
class MonthsDays
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no,days,moths;

		System.out.print("Enter Any no of Days: ");
		no = sc.nextInt();

		moths = no / 30;
		days = no % 30;

		System.out.println(moths + " Moths" + days + " Days");
	} 
}