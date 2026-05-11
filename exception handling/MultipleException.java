import java.util.Scanner;
class MultipleException
{
	public static void main(String[] args)
	{
		int[] arr = new int[5];
		String str = null;

		try{
		int res = 5 / 0;
		int no = Integer.parseInt("443");
		arr[4] = 45;
		// str.length();
		}
		catch (NumberFormatException n) {
			System.out.println("Number Format Exception Ouccured");
		}
		catch (ArithmeticException a) {
			System.out.println("ArithmeticException Ouccured");
			System.out.println(a.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("ArrayIndexOutOfBoundsException Of Ouccured");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Program End");

	}
}