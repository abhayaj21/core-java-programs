class BillWithDiscount
{
	public static void main(String[] args) {

		float price,quantity,bill,discount,totalbill,disamt;

		price = 50;
		quantity = 40;
		bill = price * quantity;
		discount = 10;
		disamt = bill * (discount/100);
		totalbill = bill - disamt;

		System.out.println("Price = " + price);
		System.out.println("Quantity = " + quantity);
		System.out.println("Bill = " + bill);
		System.out.println("Discount = " + discount + "%");
		System.out.println("Discount Amount = " + disamt);
		System.out.println("Total Bill = " + totalbill);
	}
}