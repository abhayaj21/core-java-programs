import java.util.Scanner;
class ProfitLoss
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int purchasePrice,sellingPrice;

		System.out.print("Enter Purchase Price Of Item: ");
		purchasePrice = sc.nextInt();

		System.out.print("Enter Selling Price: ");
		sellingPrice = sc.nextInt();

		if(purchasePrice == sellingPrice)
		{
			System.out.println("No Profit No Loss");
		}
		else if(sellingPrice > purchasePrice)
		{
			System.out.println("Profit");
		}
		else
		{
			System.out.println("Loss");
		}



	}
}