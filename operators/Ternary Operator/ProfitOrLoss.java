import java.util.Scanner;
class ProfitOrLoss
{
	public static void main(String[] args) {
		
		int sellPrice,purchasePrice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Purchase Price: ");
		purchasePrice = Integer.parseInt(sc.nextLine());

		System.out.print("Enter Selling Price: ");
		sellPrice = Integer.parseInt(sc.nextLine());

		System.out.println((sellPrice > purchasePrice) ? "Profit" : "Loss"); 
	}
}