import java.util.Scanner;
class IntToBinary
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] bianry = new int[32];
		int index,no,remeder;
		System.out.print("Enter Any No: ");
		no = sc.nextInt();
		index = 0;

		while(no != 0)
		{
			remeder = no % 2;
			no = no / 2;
			bianry[index] = remeder;
			index++;
		}

		System.out.print("Binary No = ");
		for(int i = index; i >= 0; i--)
		{
			System.out.print(bianry[i]);
		}
	}
}