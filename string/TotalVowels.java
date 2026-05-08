import java.util.Scanner;
class TotalVowels
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,e,i,o,u,total;
		a = e = i = o = u = total = 0;
		System.out.print("Enter Any String: ");
		String str = sc.nextLine();

		for(int j = 0; j < str.length(); j++)
		{
			char ch = str.charAt(j);
			switch(ch)
			{
				case 'a':
				case 'A':
					a++;
					break;
				case 'e':
				case 'E':
					e++;
					break;
				case 'i':
				case 'I':
					i++;
					break;
				case 'o':
				case 'O':
					o++;
					break;
				case 'u':
				case 'U':
					u++;
					break;
			}
		}

		total = a + e + i + o + u;

		if(a > 0)
		{
			System.out.println("a = " + a);
		}
		if(e > 0)
		{
			System.out.println("e = " + e);
		}
		if(i > 0)
		{
			System.out.println("i = " + i);
		}
		if(o > 0)
		{
			System.out.println("o = " + o);
		}
		if(u > 0)
		{
			System.out.println("u = " + u);
		}

		System.out.println("Total Vowels = " + total);
	}
}