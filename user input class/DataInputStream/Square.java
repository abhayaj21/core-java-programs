import java.io.DataInputStream;
import java.io.IOException;
class Square
{
	public static void main(String[] args) throws IOException{

		DataInputStream d1 = new DataInputStream(System.in);
		int no,square;

		System.out.print("Enter Any No: ");
		no = Integer.parseInt(d1.readLine());
		square = no * no;

		System.out.println("Number = " + no);
		System.out.println("Square = " + square);
	}
}