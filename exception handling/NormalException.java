import java.util.Scanner;

class NormalException
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String And Convert it No: ");
		String str = sc.next();
		try{
		int b = Integer.parseInt(str);
		System.out.println("NO = " + b);
		}catch(Exception ex)
		{
			System.out.println("Wrong Input No");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

		System.out.println("Program End");
	}
}