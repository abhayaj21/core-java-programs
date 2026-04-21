class ExpenseCal
{
	public static void main(String args[])
	{
		int dist,avg,petrolerate,toatalexpense;
		avg = 40;
		dist = 120;
		petrolerate = 105;
		toatalexpense = petrolerate * (dist / avg);
		System.out.println("Travalling = " + dist);
		System.out.println("Total Petrole Expense = " + toatalexpense);
	}
}