import java.io.*;

class ShowName
{
	public static void main(String[] args) throws IOException{
		String name;
		DataInputStream d1 = new DataInputStream(System.in);
		System.out.print("Enter Any Name: ");
		name = d1.readLine();

		System.out.println("Hi " + name);
	}
}