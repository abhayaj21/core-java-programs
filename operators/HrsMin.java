import java.util.Scanner;
class HrsMin
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,hrs,min;
		System.out.print("Enter Any Number: ");
		no = sc.nextInt();

		min = no / 60;
		hrs = min / 60;

		System.out.println("Minitues = " + min);
		System.out.println("Hourse = " + hrs);
	} 
}