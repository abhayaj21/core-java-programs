import java.util.Scanner;

class CheckResult
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sub1,sub2,sub3,sub4,sub5,sub6,totalMarks;
		char grade = 'm';
		float per;
		String remark;

		System.out.print("Enter Marks of Subject 1: ");
		sub1 = sc.nextInt();

		System.out.print("Enter Marks of Subject 2: ");
		sub2 = sc.nextInt();

		System.out.print("Enter Marks of Subject 3: ");
		sub3 = sc.nextInt();

		System.out.print("Enter Marks of Subject 4: ");
		sub4 = sc.nextInt();

		System.out.print("Enter Marks of Subject 5: ");
		sub5 = sc.nextInt();

		System.out.print("Enter Marks of Subject 6: ");
		sub6 = sc.nextInt();

		totalMarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
		per = totalMarks / 6;

		if(sub1 >= 35 && sub2 >= 35 && sub3 >= 35 && sub4 >= 35 && sub5 >= 35 &&sub6 >= 35)
		{
			remark = "Pass";
			if(per >= 90)
			{
				grade = 'A';
			}
			else if (per >= 80) {
				grade = 'B';
			}
			else if (per >= 60) {
				grade = 'C';
			}
			else if (per >= 40) {
				grade = 'D';
			}
			else
			{
				grade = 'E';
			}
		}
		else
		{
			remark = "Failed";
		}

		System.out.println("Total Marks = " + totalMarks);
		System.out.println("Persentage = " + per + "%");
		System.out.println("Remark = " + remark);

		if(remark.equals("Pass"))
		{
			System.out.println("Grade = " + grade);
		}

	}
}