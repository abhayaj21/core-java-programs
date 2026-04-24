import java.io.*;

class NoToChar
{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no;
		System.out.print("Enter Any Number: ");
		no = Integer.parseInt(br.readLine());
		char ch = (char) no;
		System.out.println("Character = " + ch);
	}
}
