import java.util.Scanner;
class RunFormula
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,ans = 0;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		for (int i = 1; i <= no; i++) {
			ans = (int)(ans + Math.pow(i,i));
		}
		System.out.println("Answer = " + ans);
	}
}