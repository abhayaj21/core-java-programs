import java.util.Scanner;
class FinallyBlock
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		System.out.print("Enter First Number: ");
		int no1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int no2 = sc.nextInt();
		int res = no1 / no2;

		System.out.println("No = " + res);
		}catch (ArithmeticException e) {
			System.out.println("Exception Ouccured");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Another Exception Generate " + e.getMessage());
			e.printStackTrace();
		}
		finally{
			//Finally Excutes Always
			System.out.println("Finally Block Excute");
		}

		System.out.println("Program Ends");
	}
}