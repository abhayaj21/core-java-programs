import java.util.Scanner;
class RunFormula2
{
	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		int ans = 0;
		for (int i = 1; i <= no; i++) {
			ans = (int)(ans + Math.pow(no,i));
		}
		System.out.println("Answer = " + ans);
		
	}
}

