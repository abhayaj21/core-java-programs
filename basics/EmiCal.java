class EmiCal
{
	public static void main(String[] args) {
		int loanamt,years,months,interest,interestamt,emi;
		loanamt = 50000;
		years = 2;
		months = 12 * years;
		interest = 10;
		interestamt = loanamt * interest / 100;
		emi = (loanamt + interestamt) / months;
		System.out.println("Loan Amount = " + loanamt);
		System.out.println("Duration = " + years);
		System.out.println("Interest Rate = " + interest + "%");
		System.out.println("Total Interest Amount = " + interestamt);
		System.out.println("Mothly EMI = " + Math.round(emi));
	}
}