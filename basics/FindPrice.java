class FindPrice
{
	public static void main(String args[])
	{
		int totalitems,sellingprice,profit,actualprice;
		totalitems = 15;
		sellingprice = 100;
		profit = 10;
		actualprice = (sellingprice - profit) / totalitems;

		System.out.println("Total Items = " + totalitems);
		System.out.println("Selling Price = " + sellingprice);
		System.out.println("Profit = " + profit);
		System.out.println("Actual Price = " + actualprice);
	}
}