import java.io.*;

class Circle
{
	public static void main(String[] args) throws IOException{
		float redius,area;
		final float PI = 3.14f;
		DataInputStream d1 = new DataInputStream(System.in);
		System.out.print("Enter Reduis Of Circle: ");
		redius = Float.parseFloat(d1.readLine());
		area = PI * redius * redius;

		System.out.println("Redius = " + redius);
		System.out.println("Area = " + area);
	}
}