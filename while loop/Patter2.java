class Patter2
{
	public static void main(String[] args) {
		int i,j;
		i = 5;
		while (i >= 1) {
			j = 1;
			while (j <= i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}