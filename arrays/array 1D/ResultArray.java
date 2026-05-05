import java.util.Scanner;
class ResultArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sub[] = new int[6];
		int totalMarks = 0;
		float per;

		System.out.println("\nEnter All Subject Marks Here...");
		for(int i = 0; i < sub.length; i++)
		{
			System.out.print("Marks Of Subject " + (i + 1) + ": ");
			sub[i] = sc.nextInt();
		}
		for(int ele: sub)
		{
			totalMarks = totalMarks + ele;
		}
		per = totalMarks / sub.length;

		System.out.println("\nResult Here...");
		System.out.println("Total Marks = " + totalMarks);
		System.out.println("Persentage = " + per + "%");
	}
}