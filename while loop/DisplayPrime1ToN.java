import java.util.Scanner;
class DisplayPrime1ToN
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no,i,x;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		i = 1;
		while (i <= no) {

			x = 2;
			while(x < i)
			{
				if(i % x == 0)
					break;
				x++;
			}
			if(i == x)
			{
				System.out.println(i);
			}


			i++;
		}
	}
}