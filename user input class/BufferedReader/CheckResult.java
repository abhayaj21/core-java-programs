import java.io.*;

class CheckResult
{
	public static void main(String args[])
	throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		byte sub1,sub2,sub3,sub4,sub5,sub6;
		int totalmarks;
		float per;

		System.out.print("\nEnter Marks of subject 1: ");
		sub1 = Byte.parseByte(br.readLine());

		System.out.print("\nEnter Marks of subject 1: ");
		sub2 = Byte.parseByte(br.readLine());

		System.out.print("\nEnter Marks of subject 1: ");
		sub3 = Byte.parseByte(br.readLine());

		System.out.print("\nEnter Marks of subject 1: ");
		sub4 = Byte.parseByte(br.readLine());

		System.out.print("\nEnter Marks of subject 1: ");
		sub5 = Byte.parseByte(br.readLine());

		System.out.print("\nEnter Marks of subject 1: ");
		sub6 = Byte.parseByte(br.readLine());

		totalmarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
		per  = totalmarks / 6;

		System.out.println("Marks Of Subject 1 = " + sub1);
		System.out.println("Marks Of Subject 1 = " + sub2);
		System.out.println("Marks Of Subject 1 = " + sub3);
		System.out.println("Marks Of Subject 1 = " + sub4);
		System.out.println("Marks Of Subject 1 = " + sub5);
		System.out.println("Marks Of Subject 1 = " + sub6);

		System.out.println("\nTotal Marks = " + totalmarks);
		System.out.println("\nPersentage = " + per + "%");
	}
}