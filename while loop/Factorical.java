import java.util.Scanner;
class Factorical
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,i,fact;

		System.out.print("Enter Any Number: ");
		no = sc.nextInt();
		i = 1;
		fact = 1;
		System.out.println("");

		while(i <= no)
		{
			fact = fact * i;
			System.out.print(i + " x ");
			i++; 
		}

		System.out.println("\b\b= " + fact);
	}
}