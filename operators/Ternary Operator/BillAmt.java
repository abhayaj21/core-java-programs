import java.util.Scanner;

class BillAmt
{
	public static void main(String[] args) {
		
		int price,quantity,discont,bill;
		float totalBill,discontAmt;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Item Price: ");
		price = sc.nextInt();

		System.out.print("Enter Quantity: ");
		quantity = sc.nextInt();

		bill = price * quantity;

		discont = (quantity < 50) ? 10 : 15;

		discontAmt = bill * discont / 100;

		totalBill = bill - discontAmt;

		System.out.println("Your Bill....\n");

		System.out.println("Price            = " + price);
		System.out.println("Quantity         = " + quantity);
		System.out.println("Bill             = " + bill);
		System.out.println("Discount         = " + discont + "%");
		System.out.println("Discount Amount  = " + discontAmt);
		System.out.println("Total Bill       = " + totalBill);

	}
}