import java.util.Scanner;

class Town
{
	public static void main(String[] args) {
		int townPopulation,tmen,twom;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Town Population:      ");
		townPopulation = input.nextInt();

		tmen = townPopulation * 52 / 100;
		twom = townPopulation * 48 / 100;

		System.out.println("Total Population Of Town  = " + townPopulation);
		System.out.println("Total Mens                = " + tmen);
		System.out.println("Total Womens              = " + twom);
	}
}