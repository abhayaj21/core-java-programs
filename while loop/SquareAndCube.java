class SquareAndCube
{
	public static void main(String[] args) {
		int square,cube;
		int n = 1;
		while(n <= 10)
		{
			square = n * n;
			System.out.println("Square " + n + " = " + square);
			n++;
		}

		n = 1;

		while(n <= 10)
		{
			cube = n * n * n;
			System.out.println("Cube " + n + " = " + cube);
			n++;
		}
	}
}