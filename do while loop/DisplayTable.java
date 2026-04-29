import java.util.Scanner;
class DisplayTable
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,i;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		i = 1;

		do{
			System.out.println(no + " x " + i + " = " + no*i);
			i++;
		}while(i <= 10);
	}
}
